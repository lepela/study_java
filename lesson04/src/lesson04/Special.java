package lesson04;

public class Special {
	public static void main(String[] args) {
		// 나누기 계산시
		// A / B = C
		// A : 피제수
		// B : 제수
		// C : 몫
		// NaN : Not a Number
		//
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println("실행전");
		System.out.println(3/0d);
		System.out.println(0/0d);
		System.out.println("실행후");
		
		// && &
		// 거짓 && 참
		
		System.out.println(false & 3/0 == 1);
		
	}
}
