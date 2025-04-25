package lesson15;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i + i;
		
		System.out.println(inter.la(10));
		
		MyInter inter2 = new MyInter() {
			@Override
			public int la(int i) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Object o = new MyInter() {
			@Override
			public int la(int i) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Object o2 = (MyInter) i -> i * i;
		Runnable runnable = () -> {
			System.out.println("Runnable");
		};
		runnable.run();
	}
}

@FunctionalInterface
interface MyInter {
	int la(int i);
}
