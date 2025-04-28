package lesson05;

public class IfEx2_1 {
	public static void main(String[] args) {
		int score = 88;
		String grade = "";
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		
		if(!(score < 70) && score % 10 >= 5 || score == 100) {
			grade += "+";
		}
		System.out.println(grade);
	}
}
