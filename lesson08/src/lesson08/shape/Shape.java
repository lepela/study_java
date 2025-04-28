package lesson08.shape;

public abstract class Shape {
//	public abstract double circum();
	public abstract double area();
	
	public String toString() {
		return "넓이 : " + area();
	}
}
