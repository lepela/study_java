package lesson17;

public class ThreadSync {
	public static void main(String[] args) throws Exception{
		Counter counter = new Counter();
		MySync mySync1 = new MySync(counter);
		MySync mySync2 = new MySync(counter);
		mySync1.start();
		mySync2.start();
		
		mySync1.join();
		mySync2.join();
		
		System.out.println(counter.i);
	}
}

class Counter {
	int i;
	void increase() {
		synchronized (this) {
			i++;
		}
	}
}

class MySync extends Thread{
	Counter counter;
	public MySync(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 100_000 ; i++) {
			counter.increase();
		}
	}
	
}
