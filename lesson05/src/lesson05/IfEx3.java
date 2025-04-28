package lesson05;

public class IfEx3 {
	public static void main(String[] args) {
		int math = 90;
		int eng = 55;
		
		String msg = "탈락";
		
		if(math >= 60) {
			if(eng >= 60) {
				msg = "통과";
			}
		}
		
		
		System.out.println(msg);
	}
}
