package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	int count;

	{
		students[count++] = new Student(1, "개똥이", 90, 80, 90);
		students[count++] = new Student(2, "새똥이", 80, 80, 90);
	}
	
	
	// 등록
	void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	// 조회
	void read() {
		System.out.println("조회 기능");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
		}
	}
	// 수정
	void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = null;
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
	}
	
	// 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 + @ 총평균
	// 3. 석차 순 정렬
	
}
