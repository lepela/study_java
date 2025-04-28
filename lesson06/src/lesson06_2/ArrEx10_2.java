package lesson06_2;

import java.util.Arrays;

public class ArrEx10_2 {
	public static void main(String[] args) {
		// 
		int[][] matrix = new int[4][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}, {0,0,0}};
		
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		System.out.println("[첫번째]");
		int count = 1;
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				matrix[i][j] = count++; 
			}
			System.out.println();
		}
		System.out.println("[두번째]");
		for(int i = 0 ; i < matrix2.length ; i++) {
			for(int j = 0 ; j < matrix2[i].length ; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("[세번째]");
		for(int i = 0 ; i < matrix3.length ; i++) {
			for(int j = 0 ; j < matrix3[i].length ; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(Arrays.toString(matrix));
		System.out.println(matrix[0]);
	}
}
