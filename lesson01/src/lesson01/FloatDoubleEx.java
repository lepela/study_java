package lesson01;

public class FloatDoubleEx {
	public static void main(String[] args) {
		float myF = 0.12345678901234567890f;
		double myD = 0.12345678901234567890;
		System.out.println(myF);
		System.out.println(myD);
		
		System.out.println(3.14);
		System.out.println(1);
		System.out.println(3.14 + 1);
		
		float f = 3.141592653589793f;
		double d = 3.141592653589793d;
		
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		
		double d2 = 3.141592653589793; // d 생략 가능
		System.out.println("double : " + d2);
	}
}
