package lesson05;

public class Ex250410 {
	public static void main(String[] args) {
		// 1. 상자 갯수 세기
		// 사과를 한 상자당 10개씩 담을수 있습니다.
		// 사과의 갯수를 123개라고 했을때 필요한 상자의 갯수 구하기
		
		// 연산자만 사용
		int apple = 123;
		int box = 10;
		
//		System.out.println(apple / box + apple % box == 0 ? 0 : 1);
		System.out.println((apple + 9) / box);
		
		// 2. 합계 구하기
		// 1 + (-2) + 3 + (-4) .. (-98) + 99 + (-100) 
		// 반복문 사용
		// 2500 + -(2550)
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
//			if(i % 2 == 0) {
//				sum += -i;
//			}
//			else {
//				sum += i;
//			}
			sum += i % 2 == 0 ? -i : i;
		}
		System.out.println(sum);
		
		// 3. 소수판정 (prime number)
		// 지정된 자연수가 소수인지 아닌지를 출력
		
		int num = 13;
		int count = 0;
		for(int i = 2 ; i < num ; i++) {
			System.out.printf("%d : %d >> %s\n", i, num % i, num % i == 0 ? "약수" : "약수아님");
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 0 ? "소수" : "소수아님");
	}
}
