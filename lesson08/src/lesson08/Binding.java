package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj);
		System.out.println(obj.si);
		System.out.println(obj.i);
		obj.sm();
		obj.m();
		
		////////////////////////////////
		A a = new A();
		B b = new B();
		
		A c = b;
		System.out.println(c);
		B d = (B)a;
//		
		B e = (B)c;
		System.out.println(e);
	}
}

class A {
	static int si = 1;
	int i = 2;
	static void sm() { System.out.println("A.sm()"); }
	void m() { System.out.println("A.m()"); }
}
class B extends A{
	static int si = 3;
	int i = 4;
	static void sm() { System.out.println("B.sm()"); }
	void m() { System.out.println("B.m()"); }
}
