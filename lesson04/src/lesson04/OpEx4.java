package lesson04;

public class OpEx4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = a == b;
		System.out.println("c : " + c);
//		boolean d = c == false;
		boolean d = !c;
		System.out.println("d : " + d);
		// 가힣
		
		System.out.println('힣' - '가' + 1);
		
		// AND : 그리고, 교집합, 둘다 참일때만 참
		// OR : 혹은, 합집합, 둘다 거짓일때만 거짓
		
		// boolean e 
		// a의 값이 양수 이면서 20보다 작은지
		boolean e = a > 0 && a < 20;
//		boolean e = 0 < a < 20;
		
		// a의 값이 홀수 이거나 5의 배수 인지를 e에 저장
		e = a % 2 == 1 || a % 5 == 0;
		
		// 논리연산
		// 논리곱 && 논리합 || 논리부정 !
		
		// 비트연산
		// 비트곱 & 비트합 | 비트부정 ~ 비트배타합 ^
		
		System.out.println(9 & 5);
		System.out.println(9 | 5);
		System.out.println(9 ^ 5);
		
		// 9 : 1001
		// 5 : 0101
		
		System.out.println(~0);
		
		// 1001 
		// 9 << 2 : 100100
		
		System.out.println(9 << 2);
		System.out.println(9 >> 2);
		
		System.out.println(-4 << 2);
		System.out.println(-4 >> 2);
		System.out.println(-4 >>> 2);
		
		System.out.println(Integer.toBinaryString(-4 >>> 2));
		
		// A * 0 = 10
		// D / B = A 
		
		
		
		
		
		
	}
}
