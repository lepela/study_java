package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		ListTest lt = new ListTest();
//		System.out.println(lt);
//		System.out.println(lt.hashCode());
//		System.out.println(Integer.toHexString(lt.hashCode()));
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		System.out.println("순차 추가");
		seqInsert(arrayList);
		seqInsert(linkedList);
//		System.out.println("비순차 추가");
//		nonSeqInsert(arrayList);
//		nonSeqInsert(linkedList);
		System.out.println("순차 삭제");
		seqDelete(arrayList);
		seqDelete(linkedList);
	}
	
	static void seqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000_000 ; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
	static void nonSeqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 500_000 ; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
	static void seqDelete(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000_000 ; i++) {
			list.remove(list.size()-1);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
}
