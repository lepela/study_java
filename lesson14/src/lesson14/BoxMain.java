package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setItem("양말");
		System.out.println(box.getItem());
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		
		Comparator<Object> comp = (a, b) -> 0;
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp);
	}
}
class Box<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public static <T> void sm(T t) {
		System.out.println(t);
	}
	
}
