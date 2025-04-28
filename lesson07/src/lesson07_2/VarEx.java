package lesson07_2;

public class VarEx {
	public static void main(String[] args) {
		System.out.println("Avante의 제조사 : " + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1.color = "화이트";
		a2.color = "블랙";
				
		System.out.println("a1의 색상 : " + a1.color);
		System.out.println("a2의 색상 : " + a2.color);
		
		System.out.println("a1의 제조사 : " + a1.company);
		System.out.println("a2의 제조사 : " + a2.company);
		
		a1.company = "기아";
		
		System.out.println("Avante의 제조사 : " + Avante.company);
		System.out.println("a1의 제조사 : " + a1.company);
		System.out.println("a2의 제조사 : " + a2.company);
	}
}
class Avante {
	String color;
	static String company = "현대";
}