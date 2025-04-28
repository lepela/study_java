package lesson07_2;

public class Car2 {
	String color;
	String company;
	String type;
	
	Car2() {
		this("white", "기아", "경차");
	}
	Car2(String color, String company, String type) {
		this.color = color;
		this.company = company;
		this.type = type;
	}
	Car2(String com, String t) {
		this("white", com, t);
	}
	Car2(String t) {
		this("white", "기아", t);
	}
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
