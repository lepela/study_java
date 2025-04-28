package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		while(set.size() < 6) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println(set);
	}
}
