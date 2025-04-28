package lesson05;

public class BreakEx {
	public static void main(String[] args) {
		System.out.println("============== break ==============");
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("============== continue ==============");
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
