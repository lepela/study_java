package lesson17;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Countdown {
	public static void main(String[] args) throws Exception{
//		for(int i = 10 ; i > 0 ; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		IntStream.rangeClosed(1, 10).boxed().sorted(Comparator.reverseOrder()).forEach(i->{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
