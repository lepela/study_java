package lesson05;

public class DoWhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while(false);
		
		System.out.println("합계 : " + sum);

		sum = 0;
		i = 1;
		while(sum == i){
			sum += i;
			i++;
		} 
		
		System.out.println("합계 : " + sum);
	}
}
