package lesson12;

public class WrapperEx {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = 20;
		
		System.out.println(i + i2);
		
		// 기본형 > wrapper ( boxing )
		Integer i3 = Integer.valueOf(i);
		// wrapper > 기본형 ( unboxing )
		int i4 = i3.intValue();
		
		// auto boxing
		Integer i5 = i;
		int i6 = i5;
		
		m(10L);
		m(Long.valueOf(10));
		m((long)i6);
		
		int i7 = Integer.parseInt("1234");
		Integer i8 = Integer.valueOf("1234");
		long l = Long.parseLong("1234");
		
		String input = "";
		boolean b = input.equals("y");
		System.out.println(b);
		
	} 
	static void m(Long l) {
		
	}
}
