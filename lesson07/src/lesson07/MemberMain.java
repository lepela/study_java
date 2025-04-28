package lesson07;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member();
		m.num = 1;
		m.name = "전상현";
		m.age = 28;
		
		Member m2 = new Member();
		m2.num = 2;
		m2.name = "김지유";
		m2.age = 22;
		
		m2 = m;
		m2.age = 30;
		m.num = 3;
		
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);

		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		
		
		if(m == m2) {
			System.out.println("m객체는 m2객체와 같다.");
		}
		else {
			System.out.println("m객체는 m2객체와 다르다.");
		}
	}
}
