package lesson05;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		String str = "1234";
		String str2 = "1234";
		
		// 문자열 비교
		// str.equals(str2)
		
//		if(str == str2) {
//			System.out.println("같은 문자열");
//		}
		
		if(str.equals(str2)) {
			System.out.println("같은 문자열");
		}
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // 사용자의 입력을 문자열로 수집
		
	}
}
