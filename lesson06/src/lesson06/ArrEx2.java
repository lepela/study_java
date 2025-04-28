package lesson06;

public class ArrEx2 {
	public static void main(String[] args) {
		String[] arrStr = {"홍길동", "이순신", "김유신"};
		
		// 배열의 길이
		System.out.println(arrStr.length);
		
		for(int i = 0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i]);
		}
	}
}
