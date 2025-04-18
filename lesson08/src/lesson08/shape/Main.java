package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
//		System.out.println(circle.area()); // 넓이
//		System.out.println(circle.circum()); // 둘레
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area()); //
//		System.out.println(rect.circum()); //
		
		
		Shape[] shapes = {circle, rect};
		
		for(int i = 0 ; i < shapes.length ; i++) {
			System.out.println("=========" + shapes[i].getClass().getSimpleName() + "=========" );
			System.out.println(shapes[i].area());
			System.out.println(shapes[i].circum());
		}
	}
}
