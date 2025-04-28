package lesson07_3;

//import java.util.Date;
//import java.util.Scanner;
import java.util.*;

public class PackageEx {
	public static void main(String[] args) {
		lesson07.TvMain main = new lesson07.TvMain();
		Scanner scanner = new java.util.Scanner(java.lang.System.in);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
	}
}
