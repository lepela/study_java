package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

// 1.0
// 1.1
// 1.2
// 1.7
@Deprecated
public class DateEx {
	public static void main(String[] args) {
		DateEx ex = new DateEx();
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sdf.format(now));
	}
}
