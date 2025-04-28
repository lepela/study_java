package lesson07_3;

public class InitEx {
	InitEx() {
		System.out.println("생성자");
	}
	
	static {
		System.out.println("클래스 init 블록");
	}
	
	{
		System.out.println("인스턴스 init 블록");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main init1 객체 생성");
		new InitEx(); 
		System.out.println("main init2 객체 생성");
		new InitEx();
		System.gc();
	}
}
