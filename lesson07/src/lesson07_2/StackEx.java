package lesson07_2;

public class StackEx {
	public static void main(String[] args) {
		// main > m1 > m2 > m3
		System.out.println("main start");
		method1();
		System.out.println("main end");
	}
	static void method1() {
		System.out.println("method1 start");
		method2();
		System.out.println("method1 end");
	}
	static void method2() {
		System.out.println("method2 start");
//		method3();
		method1();
		System.out.println("method2 end");
	}
	static void method3() {
		System.out.println("method3 start");
		System.out.println("method3 end");
	}
	
}
