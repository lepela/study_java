package student;

import java.util.Arrays;

public class StudentService {
	// 1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	// 3. 점수값 입력의 범위 0~100 사이만 인정
	// 4. 이름 입력은 한글만 인정, 2글자~4글자사이
	// 5. 임시데이터의 점수값을 랜덤으로 배정(60~100)
	
	// 도형 과제 추가
	// 삼각형, 3차원도형 추가 구현
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	int count;

	{
		students[count++] = new Student(1, "개똥이", 90, 80, 90);
		students[count++] = new Student(2, "새똥이", 80, 80, 90);
		students[count++] = new Student(3, "말똥이", 10, 80, 90);
		students[count++] = new Student(4, "소똥이", 100, 100, 90);
		
		sortedStudents = students.clone();
		rank();
	}
	
	
	// 입력 : 학번
	// 출력 : 학생
	Student findBy(int no) {
		Student student = null;
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	// 등록
	void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}
		
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		students[count++] = new Student(no, name, kor, eng, mat);
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	// 조회
	void read() {
		System.out.println("조회 기능");
		print(students);
	}
	void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	void print(Student[] stu) {
		for(int i = 0 ; i < count ; i++) {
			System.out.println(stu[i]);
		}
	}
	
	// 수정
	void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();	
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	
	void allAvg() {
		// 국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		// count
		
		for(int i = 0 ; i < count ; i++) {
			avgKor += students[i].kor; 
			avgEng += students[i].eng; 
			avgMat += students[i].mat; 
		}
		avgKor /= (double)count;
		avgEng /= (double)count;
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3; 
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);
		
	}
	
	void rank() {
		
		for(int i = 0 ; i < count - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < count ; j++) {
				if(sortedStudents[idx].total() < sortedStudents[j].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
		}		
	}
	
}
