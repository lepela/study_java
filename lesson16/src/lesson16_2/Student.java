package lesson16_2;

public class Student {
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, score=%s]", name, score);
	}
}
