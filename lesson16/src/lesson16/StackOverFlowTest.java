package lesson16;

public class StackOverFlowTest {
	public static void main(String[] args) throws Exception{
//		main(args);
//		new Data();
//		new Data();
//		Class.forName("lesson16.Data");
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
		Data.print(10);
	}
}

class Data {
//	Data data = new Data();
	int i = print(1);
	static int si = print(2);
	{
		System.out.println("초기화 블럭");
	}
	static {
		System.out.println("클래스 초기화 블럭");
	}
	public Data() {
		System.out.println("생성자");
	}
	static int print(int i) {
		System.out.println("print호출됨 :: " + i);
		return i;
	}
}
