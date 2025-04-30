package lesson18_ex;

public class GenericEx {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>(10);
		Box<String> box2 = new Box<>("가나다라");
		
	}
}

class Box<T> {
	T item;
	public Box(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
