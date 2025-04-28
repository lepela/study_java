package lesson13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	private int[] arr = new int[10];
	private int size;
	
	void push(int i) {
		if(arr.length == size) arr = Arrays.copyOf(arr, arr.length*2);
		arr[size++] = i;
	}
	int pop() {
		if(size == 0) throw new EmptyStackException();
		return arr[--size];
	}
	int size() {
		return size;
	}
}
