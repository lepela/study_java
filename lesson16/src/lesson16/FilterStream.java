package lesson16;

import java.util.List;

public class FilterStream {
	public static void main(String[] args) {
		List<String> list = List.of("홍길동", "김유신", "홍길동", "이순신", "홍길동", "유관순");
		System.out.println("distinct");
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("'홍'이라는 글자로 시작하는 문자열로 필터링");
		list.stream().filter(s->s.startsWith("홍")).forEach(System.out::println);

		System.out.println("'홍'이라는 글자로 시작하는 문자열로 필터링 + distinct");
		list.stream().distinct().filter(s->s.startsWith("홍")).forEach(System.out::println);
	}
}
