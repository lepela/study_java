package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		// 1 0 1
		//   0 1 1
		//     1 1 2
		
		// 1. 피보나치 수열 출력
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
		// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속.
		// 1 1 2 3 5 8 13 21 44 65 109 ...
		
//		for(int i = 0, a = 1, b = 0, c = 0 ; i < 20 ; i++, a = b, b = c) {
//			System.out.print((c = a + b) + " ");
//		}
				
		/*
			1 1 2
			  1 2 3
			    2 3 5
		*/
		
		// 2. 50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 3 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] tmp = new int[3];
		System.out.println(Arrays.toString(tmp));
		int length = 0;

		for(int n : arr) {
			boolean insert = true;
			for(int i = 0 ; i < length ; i++) {
				if(n == tmp[i]) {
					insert = false;
					break;
				}
			}
			if(insert) {
				tmp[length++] = n;
			}
		}
		System.out.println(Arrays.toString(tmp));
		tmp = Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
		
		
		
		// 3. 2차원 배열
		/*
		 * **
		 * **
		 * **
		 * *****
		 * *****
		 * 		*/
		char[][] chs = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		// 90도 시계 방향 회의 결과를 result에 담으시오.
		char[][] result2 = new char[5][5];
		for(int i = 0 ; i < chs.length ; i++) {
			for(int j = 0 ; j < chs[i].length ; j++) {
				System.out.print(chs[i][j] + " ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		}
		
		for(char[] t : result2) {
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0]; // 1
		result[1][2] = val[0][1]; // 2
		result[2][2] = val[0][2]; // 3
		
		result[0][1] = val[1][0]; // 4
		result[1][1] = val[1][1]; // 5
		result[2][1] = val[1][2]; // 6

		result[0][0] = val[2][0]; // 7
		result[1][0] = val[2][1]; // 8
		result[2][0] = val[2][2]; // 9
		
		for(int i = 0 ; i < val.length ; i++) {
			for(int j = 0 ; j < val[i].length ; j++) {
				System.out.print(val[i][j] + " ");
				result[j][3-1-i] = val[i][j];
			}
			System.out.println();
		}
		
		for(int[] t : result) {
			for(int n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		/*	
		 * 7 4 1
		 * 8 5 2
		 * 9 6 3
		 * 
		 * 
		 * 
		 * 	
			*/	
	}		
}
