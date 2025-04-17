package student;

// Data class
public class Student {
	// 1. StudentMain의 나머지 기능 구현(메세지 출력)
	// 2. Student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의필드를 다 사용)
	
	// 학생 1인의 총점, 평균을 계산 한다면?
	// 어떻게 처리 할건지?
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
//	int total = kor+eng+mat;
	
	Student() {}
	
	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	int total() {
		return kor+eng+mat;
	}
	
	// 평균 계산 double type
	double avg() {
		return total() / 3d;
	}
}
