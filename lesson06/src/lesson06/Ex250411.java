package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		// 187000원 
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		int money = 187000;
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
//		count[0] = money / units[0]; // 3 = 187000 / 50000
//		money %= units[0]; // 187000 => 37000
		
		for(int i = 0 ; i < units.length ; i++) {
			count[i] = money / units[i];
			money %= units[i];
			System.out.printf("%d원 %d장\n", units[i], count[i]);
		}
		
		// 이하 코드 작성 후 갯수 출력
		
		// 2. 임의의 문자열 생성, CAPTCHA 생성
		// 문자열의 범위는 숫자,영대,영소 10글자
		
		char[] captcha = new char[10];
		// 난수의 범위 0~61
		// 0~9 그대로 숫자
		// 10~35 까지는 영대
		// 36이상은 영소
		for(int i = 0 ; i < 10 ; i++) {
			int ch = (int)(Math.random() * 62);
			if(ch < 10) { // 숫자
				captcha[i] = (char)(ch + '0' - 0);
			}
			else if(ch < 36) { // 영대 10 A 65
				captcha[i] = (char)(ch + 'A' - 10);
			}
			else { // 영소 36  97
				captcha[i] = (char)(ch + 'a' - 36);
			}
		}
		System.out.println(captcha);
		// 3. 빈도수 구하기
		// 100개의 공간, 범위는 0~9
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] counts = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			counts[arr[i]]++;
		}
		System.out.println(Arrays.toString(counts));
	}
}
