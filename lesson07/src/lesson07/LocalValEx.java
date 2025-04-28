package lesson07;

public class LocalValEx {
	public static void main(String[] args) {
		Local local = new Local();
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i = 0 ; i < 10 ; i++) {
			int temp = 0;
			temp += i;
		}
//		System.out.println(temp);
	}
}
class Local {
	String name;
	void process() {
		String name;
		name = "홍길동";
	}
	void printAge1() {
		int age = 20;
		System.out.println(age);
	}
	void printAge2() {
		int age = 30;
		System.out.println(age);
	}
}
