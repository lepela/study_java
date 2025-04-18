package lesson08.shape;

public class Circle extends Shape{
	int r;
	public Circle() {}
	public Circle(int r) {
		this.r = r;
	}
	public double circum() {
		return 2 * r * Math.PI;
	}
	public double area() {
		return r * r * Math.PI;
	}
}
