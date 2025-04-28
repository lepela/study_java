package lesson06_2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		int c = a;
		int[] arr = {1,2,3};
		int[] arr2 = arr;
		int[][] arr3 = {{1,2},{3}};
		arr3[1] = arr3[0];
		
		System.out.println(Arrays.deepToString(arr3));
		arr3[0][0] = 10;
		System.out.println(Arrays.deepToString(arr3));
		arr3[0] = arr;
	}
}
