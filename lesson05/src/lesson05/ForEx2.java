package lesson05;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		// 현재의코드를 기반으로 3의배수의 합계를 구하기
		
		int sum = 0;
		for(int i = 1 ; i <= 100 / 3; i++) {
			sum += i * 3;
			System.out.printf("i : %3d, sum : %4d\n", i, sum);
		}
		System.out.println(sum);
		
		// 숫자를 입력받고 해당 숫자의 약수들을 출력
		// 12
		// 1 2 3 4 6 12
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력");
		int input = scanner.nextInt(); // 6
		
		int i = 1 ; 
		while(i <= input) {
			if(input % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		
	}
}
