package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex = "\\d"; // 숫자
		regex = "[0-9]"; // 숫자
		regex = "\\D"; // 숫자아님
		regex = "[^0-9]"; // 숫자아님
		Pattern p= Pattern.compile("b[^A-Za-z]");
		Matcher m;
		String[] strs = {"bat", "cat", "bed", "bAt", "Bat", "b", "b0"};
		
		// 이메일주소패턴
		// 휴대전화번호 패턴
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
		}
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replaceFirst("a", "e"));
		System.out.println("abcd1234abcd".replace("a", "e"));
	}
}
