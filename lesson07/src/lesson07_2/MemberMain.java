package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {
		// this 미래에 생성될 객체의 주소값
		Member m = new Member(20);
		System.out.println(m.num);
		System.out.println(m);
		Member member = m.m1();
		System.out.println(member);
		m.m2(m);
	}
}
class Member {
	int num = 10;
	Member(int num) {
		this.num = num;
	}
	Member m1() {
		return this;
	}
	void m2(Member m) {
		System.out.println(m);
	}
}
