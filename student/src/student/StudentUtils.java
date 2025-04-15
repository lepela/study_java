package student;

import java.util.Scanner;

public class StudentUtils {
	static final Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
}
