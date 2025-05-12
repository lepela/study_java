package utils;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


public class BankUtils {
	public static void main(String[] args) {
		String pw1 = nextLine("비밀번호");
		String pw2 = nextLine("비밀번호 확인", pw1::equals, "같지않습니다");
		
	}
	private static final Scanner scanner = new Scanner(System.in);
	
	// base method
	public static <T> T next(String msg, Predicate<T> pred, String errMsg, Function<String, T> parser) {
		T t = null; 
		do {
			System.out.print(msg + " > ");
			try {
				t = parser.apply(scanner.nextLine());
				if(pred == null || pred.test(t)) return t;
				else throw new IllegalArgumentException(errMsg);
			}
			catch (RuntimeException e) {
				System.out.println(errMsg);
			}
		}
		while(true);
	}
	
	public static <T> T next(String msg, Function<String, T> parser) {
		return next(msg, null, null, parser);
	}
	

	public static String nextLine(String msg, Predicate<String> pred, String errMsg) {
		return next(msg, pred, errMsg, s->s);
	}
	
	
	public static String nextLine(String msg) {
		return nextLine(msg, null, null);
	}
	
	
	public static int nextInt(String msg, Predicate<Integer> pred, String errMsg) {
		return next(msg, pred, errMsg, Integer::parseInt);
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}

	public static long nextLong(String msg) {
		return Long.parseLong(nextLine(msg));
	}
	
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg + " [y/n]");
		return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	}
}
