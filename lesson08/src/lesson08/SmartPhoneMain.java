
package lesson08;

public class SmartPhoneMain {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.company = "현대";
		p.color = "화이트";
		
		System.out.println("phone 출력");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "블랙";
		
		System.out.println("smartphone 출력");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		
		sp.call();
		sp.receive();
		sp.installApp();
		
	}
}

