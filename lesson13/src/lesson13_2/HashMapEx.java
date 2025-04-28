package lesson13_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Properties;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		Integer j = map.put("B", 20);
		int i = map.put("B", 30);
		map.put("C", 30);
		System.out.println(map);
//		System.out.println(i);
//		System.out.println(j);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		List<Integer> v1 = new ArrayList<Integer>(map.values());
		Set<Integer> v2 = new HashSet<Integer>(map.values());
		System.out.println(v1);
		System.out.println(v2);
		
		Set<Entry<String, Integer>> s = map.entrySet();
		for(Entry<String, Integer> e : s) {
			System.out.println(e.getKey() + " :: " + e.getValue());
		}
		Properties properties = new Properties();
	}
}
