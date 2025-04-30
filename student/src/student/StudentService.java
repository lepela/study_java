package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unchecked")
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents;

	{
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("data/student.ser"));
			students = (List<Student>)ois.readObject();
			ois.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("파일을 불러 올수 없습니다. 임시 데이터셋으로 진행합니다.");
			students.add(Student.builder().no(1).name("개똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
			students.add(new Student(2, "새똥이", randomScore(), randomScore(), randomScore()));
			students.add(new Student(3, "말똥이", randomScore(), randomScore(), randomScore()));
			students.add(new Student(4, "소똥이", randomScore(), randomScore(), randomScore()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sortedStudents = new ArrayList<Student>(students);
		rank();
	}
	
	private static StudentService studentService = new StudentService();
	private StudentService() {
		
	}
	public static StudentService getInstance() {
		return studentService;
	}
	
	
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}
	
	
	// 입력 : 학번
	// 출력 : 학생
	public Student findBy(int no) {
		Student student = null;
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}

	public int checkRange(String subject, int input, int start, int end) {
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다. " + start + "~" + end + "사이의 입력을 해주세요");
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}
	
	public String inputName() {
		String name = StudentUtils.nextLine("이름 > ");
		if(!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 2~4글자 한글로 구성되어야합니다");
		}
		return name;
	}
	// 등록
	public void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}
		
		String name = inputName();
		
		int kor = StudentUtils.nextInt("국어 > ");
		checkRange("국어", kor);
		
		int eng = StudentUtils.nextInt("영어 > ");
		checkRange("영어", eng);
		
		int mat = StudentUtils.nextInt("수학 > ");
		checkRange("수학", mat);
		Student s2 = new Student(no, name, kor, eng, mat);
		students.add(s2);
		sortedStudents.add(s2);
		rank();
		save();
	}
	// 조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}
	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	public void print(List<Student> stu) {
		stu.forEach(s -> System.out.println(s));
	}
	
	// 수정
	public void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		String name = inputName();
		s.setName(name);
		s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > ")));
		s.setEng(checkRange("영어", StudentUtils.nextInt("영어 > ")));
		s.setMat(checkRange("수학", StudentUtils.nextInt("수학 > ")));
		rank();
		save();
	}
	// 삭제
	public void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		students.remove(s);
		sortedStudents.remove(s);
		save();
	}
	
	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
//		students.stream().map(s->s.getKor());
		
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		// count
		int size = students.size();
		for(int i = 0 ; i < size ; i++) {
			avgKor += students.get(i).getKor(); 
			avgEng += students.get(i).getEng(); 
			avgMat += students.get(i).getMat(); 
		}
		avgKor /= (double)size;
		avgEng /= (double)size;
		avgMat /= (double)size;
		
		avgAll = (avgKor + avgEng + avgMat) / 3; 
		
		System.out.println(size + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);
		
	}
	
	public void rank() {
		Collections.sort(sortedStudents, (o1, o2) -> o2.total() - o1.total());
	}
	
	private void save() {
		try {
			File file = new File("data");
			if(!file.exists()) {
				file.mkdirs();
			}
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(file, "student.ser")));
			oos.writeObject(students);
			oos.close();
		} catch (IOException e) {
			System.out.println("파일 접근 권한이 없습니다.");
			e.printStackTrace();
		}
	}
	
}
