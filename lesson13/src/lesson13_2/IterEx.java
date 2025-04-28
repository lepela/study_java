package lesson13_2;

import java.util.Iterator;
import java.util.Set;

public class IterEx {
	public static void main(String[] args) {
		Set<Integer> set = Set.of(10, 20, 30, 40, 50);
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====================");
		for(Integer i : set) {
			System.out.println(i);
		}
		
	}
}
