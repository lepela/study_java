package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex250423 {
	public static void main(String[] args) {
		// Map을 사용한 문자의 빈도 계산
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<>();
		// {a:5, b:4, c:3, d:5}
		// 문자열, 문자배열, 문자열배열
		String[] strs = str.split("");
		for(int i = 0 ; i < str.length() ; i++) {
			String s = str.charAt(i) + "";
			Integer in = map.get(s);
			map.put(s, in == null ? 1 : in + 1);
		}
		
//		Stream.of(strs).forEach(s->{
//			Integer i = map.get(s);
//			map.put(s, i == null ? 1 : i + 1);
//			System.out.println(map);
//		});
		System.out.println(map);
	}
}
