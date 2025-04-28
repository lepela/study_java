package lesson05;

public class SwitchEx2 {
	public static void main(String[] args) {
		int score = 88;
		String grade = "";
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default :
			grade = "F";
		}
		System.out.println(grade);
	}
}
