package lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("int형 난수");
		IntStream is = random.ints(3);
		is.forEach(System.out :: println);
		
		
		System.out.println("=================");
		is = random.ints(10, 0, 3);
		is.forEach(System.out :: println);
		
		System.out.println("long형 난수");
		random.longs(3, 0, 10).forEach(System.out::println);
		
		System.out.println("double형 난수");
		random.doubles(3).forEach(System.out::println);
		
		"ABCD".chars().forEach(i -> System.out.println((char)i));
		
//		is.forEach(s->System.out.println(s));
//		DoubleBinaryOperator dbo = (x, y) -> Math.max(x, y);
//		DoubleBinaryOperator dbo = Math::max;
//		dbo.applyAsDouble(10, 20);
//		BiPredicate<String, String> pre = (s1, s2) -> s1.equals(s2); 
//		BiPredicate<String, String> pre = String::equals;
//		
//		Function<String, Integer> fn = s -> Integer.parseInt(s);
//		Function<String, Data> fn2 = s -> new Data(s);
//		Function<String, Data2> fn2 = Data2::new;
	}
}

class Data2 {
	String name;
	public Data2(String name) {
		this.name = name;
	}
}
