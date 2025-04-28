package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		System.out.println(list);
		list = new ArrayList<>(new LinkedHashSet<>(list)); 
		System.out.println(list);
	}
}
