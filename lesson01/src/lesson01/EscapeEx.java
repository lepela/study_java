package lesson01;

public class EscapeEx {
	public static void main(String[] args) {
		String greet = "안녕하세요, \n저는 \"홍길동\" 입니다.";
		String greet2 = "\t반갑습니다";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		int i = 10;
		{
			System.out.println(i);
			double d = 10;
		}
//		System.out.println(d);
		
		// short > 2 byte
		// char > 2 byte
		long l = 10;
		i = (int)l;
		
		byte b = (byte)128;
		
		System.out.println("1234567890123456789012345678901234567890");
		System.out.println(Integer.toBinaryString(300));
		System.out.println((byte)300);
		// 300
		// 1 0010 1100
		
		
	}
}
