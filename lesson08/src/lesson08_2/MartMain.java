package lesson08_2;

public class MartMain {
	public static void main(String[] args) {
		Buyer 송성준 = new Buyer();
		송성준.buy(new AirCon());
		송성준.display();
		송성준.buy(new Computer());
		송성준.buy(new Computer());
		송성준.display();
		송성준.buy(new Computer());
		송성준.display();
	}
}

// 상품 기반 클래스
class Product {
	int price;
	public Product(int price) {
		this.price = price;
	}
	public String toString() {
		return getClass().getSimpleName() + "[" + price + "]";
	}
}

class Cooker extends Product {
	public Cooker() {
		super(50);
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}
	
}

class AirCon extends Product {
	public AirCon() {
		super(500);
	}
}


class Buyer {
	Product[] products = new Product[10];
	int count;
	int amount = 1000;
	
	public void buy(Product product) {
		if(product.price <= amount) {
			products[count++] = product;
			amount -= product.price;
		}
		else {
			System.out.println("잔고가 부족하여 구매가 불가능합니다.");
		}
	}
	
	public void display() {
		System.out.println("현재 구매한 물건들");
		String str = "";
		for(int i = 0 ; i < count ; i++) {
			str += products[i] + " ";
		}
		System.out.println(str);
		System.out.println("현재의 잔고 : " + amount);
	}
	 
	
	
	
	
}
