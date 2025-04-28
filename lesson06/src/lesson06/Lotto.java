package lesson06;

import java.util.Arrays;
import java.util.Comparator;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0;
		while(true) {
			int number = (int)(Math.random() * 45 + 1);
			
			boolean insert = true;
			
			for(int i = 0 ; i <= idx ; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break;
		}
		//System.out.println(Arrays.toString(lotto));
		int[] arr = lotto;
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
		Integer[] arr2 = {5,4,2,3,1};
		Arrays.sort(arr2, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
			
		});;
		System.out.println(Arrays.toString(arr2));
	}
}
