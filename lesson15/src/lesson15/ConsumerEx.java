package lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerEx {
	public static void main(String[] args) {
		List<Integer> list = List.of(5, 4, 1, 3, 2);

		list.forEach(t -> System.out.println(t));
		
		Map<String, Integer> map = new HashMap<String, Integer>(Map.of("A", 10, "B", 20));
		System.out.println(map.getClass().getName());
		
		map.forEach((k,v)->{
			System.out.println(k + "::" + v);
		});
		
		DoubleConsumer dc = d -> System.out.println(Math.round(d));
		dc.accept(10.5);
		
		ObjDoubleConsumer<String> odc = (s, d) -> {};
		
		Supplier<String> supplier = () -> "12345";
		System.out.println(supplier.get());
		
		// 1~100 List
		List<Integer> list2 = IntStream.rangeClosed(1, 100).filter(i -> i%2 == 0).boxed().collect(Collectors.toList());
		System.out.println(list2);
		
		BiFunction<String, Integer, Boolean> bf = (s, i) -> s.equals(i+"");
		BiPredicate<String, Integer> bp = (s, i) -> s.equals(i+"");
		DoublePredicate dp = d -> d == 0;
		UnaryOperator<Integer> uo = i -> i;
		
	}
}
