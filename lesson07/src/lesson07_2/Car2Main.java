package lesson07_2;

public class Car2Main {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("중형차");
		Car2 c3 = new Car2("현대", "대형차");
		Car2 c4 = new Car2("black", "기아", "화물차");
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		
	}
}
