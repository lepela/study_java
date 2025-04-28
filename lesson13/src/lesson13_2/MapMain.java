package lesson13_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		List<Map<String, Object>> students = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("no", 1);
		map.put("name", "새똥이");
		map.put("kor", 90);
		map.put("eng", 80);
		map.put("mat", 90);
		students.add(map);
		System.out.println(students);
		
		for(Map<String, Object> m: students) {
			int kor = (Integer) m.get("kor");
			int eng = (Integer) m.get("eng");
			int mat = (Integer) m.get("mat");
			
			System.out.println(m.get("no") + "" + (kor + eng + mat));
		}
	}
}
