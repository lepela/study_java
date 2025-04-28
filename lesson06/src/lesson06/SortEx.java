package lesson06;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		// 정렬
		// 버블 정렬
		
		// {3,4,1,5,2}
		
		// 1회차
		// {3,4,1,5,2}
		// {3,1,4,5,2}
		// {3,1,4,5,2}
		// {3,1,4,2,5}
		
		// 2회차
		// {1,3,4,2,5}
		// {1,3,4,2,5}
		// {1,3,2,4,5}
		
		// 3회차
		// {1,3,2,4,5}
		// {1,2,3,4,5}
		
		// 4회차
		// {1,2,3,4,5}
		
		int[] arr = {5,4,3,2,1};
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
