package shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
//		System.out.println(circle.area()); // 넓이
//		System.out.println(circle.circum()); // 둘레
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area()); //
//		System.out.println(rect.circum()); //
		
		Cylinder cylinder = new Cylinder(new Circle(4), 5);
		
		Shape[] shapes = {circle, rect, cylinder};
		
		for(int i = 0 ; i < shapes.length ; i++) {
			System.out.println("=========" + shapes[i].getClass().getSimpleName() + "=========" );
			System.out.println("넓이 : " + shapes[i].area());
			if(shapes[i] instanceof Shape2D) { // 2차원 도형일때
				System.out.println("둘레 : " + ((Shape2D)shapes[i]).circum());
			}
			else if(shapes[i] instanceof Shape3D) {
				System.out.println("부피 : " + ((Shape3D)shapes[i]).volume());
			}
//			System.out.println(shapes[i].circum());
		}
		
		System.out.println("==============================");
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
}
