package student;

// Data class
public class Student implements Comparable<Student>{
	// 클래스 내에 선언할 위치
	// 1. 필드
	// 2. 생성자
	// 3. getter / setter
	// 4. 추가적인 메서드
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {}
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 
	// no, name, kor, eng, mat
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	public int total() {
		return kor+eng+mat;
	}
	
	// 평균 계산 double type
	public double avg() {
		return total() / 3d;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	static class Builder {
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor(int kor) {
			this.kor = kor;
			return this;
		}
		public Builder eng(int eng) {
			this.eng = eng;
			return this;
		}
		public Builder mat(int mat) {
			this.mat = mat;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
	
	public static void main(String[] args) {
		Student student = Student.builder().no(1).name("새똥이").kor(90).build();
		System.out.println(student);
	}
	
}
