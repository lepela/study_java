package lesson08.shape;

public class Rect extends Shape implements Shape2D{
	int x, y;
	
	public Rect() {	}
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double circum() {
		return (x + y) * 2;
	}
	public double area() {
		return x * y;
	}
}
