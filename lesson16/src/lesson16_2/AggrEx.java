package lesson16_2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AggrEx {
	public static void main(String[] args) {
		// 갯수, 합계, 평균, 최대, 최소
		List<Student> list = List.of(new Student("새똥이", 100), new Student("개똥이", 90), new Student("말똥이", 70));
		
		// 80점 이상의 학생의 인원수 구하기
		long count = list.stream().filter(s->s.score >= 80).count();
		System.out.println(count);
		
		int sum = list.stream().mapToInt(s -> s.score).sum();
		System.out.println(sum);
		
		OptionalDouble od = list.stream().mapToInt(s -> s.score).average();
		System.out.println(od.getAsDouble());
		
		Optional<Student> optional = list.stream().max((s1, s2) -> s1.name.compareTo(s2.name));
		System.out.println(optional);
		
		long min = list.stream().mapToLong(s -> s.score).min().getAsLong();
		System.out.println(min);
		
//		Stream.concat(null, null)
		"abcd".concat("1234");
		
	}
}
