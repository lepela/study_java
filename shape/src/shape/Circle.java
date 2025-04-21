package shape;

public class Circle extends Shape implements Shape2D{
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
	public String toString() {
		return super.toString() + "\n둘레 : " + circum();
	}
}
