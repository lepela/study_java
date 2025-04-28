package lesson05;

import java.util.Scanner;

public class Ex250409 {
	public static void main(String[] args) {
		// 27명 5다스 dozen(12)
		int colorPen = 5 * 12;
		int studentCount = 27;
		int divColorPen = colorPen / studentCount;
		int remainColorPen = colorPen % studentCount;
		System.out.println(divColorPen);
		System.out.println(remainColorPen);
		
		// 나이, 키, 보호자여부, 심장질환여부
		int age = 10, height = 150;
		boolean parent = false, hearchDease = false;
		
		boolean isRide = !hearchDease && height >= 120 && (age >= 6 || parent);
		System.out.println(isRide);
		
		int year = 2000;
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		System.out.println(leapYear);
		
		int price = 187_000;
		int oman = price / 50_000;
		int ilman = price % 50_000 / 10_000;
		int ochun = price % 10_000 / 5_000;
		int ilchun = price % 5_000 / 1_000;
		System.out.println(oman);
		System.out.println(ilman);
		System.out.println(ochun);
		System.out.println(ilchun);
		
		int number = 1234;
		int result = 1234 / 100 * 100;
		result = number - number % 100;
		System.out.println(result);
		
		
		// 1. 로그인 인증
		// 사용자로 부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin, 비밀번호가 1234일때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 비밀번호
		// 아이디가 admin이 아니면 없는 계정 메세지 출력
		Scanner scanner = new Scanner(System.in);
		String id = "";
		String pw = "";
		System.out.print("아이디를 입력하세요 > ");
		id = scanner.nextLine();
		System.out.println("입력한 아이디 : " + id);

		System.out.print("비밀번호를 입력하세요 > ");
		pw = scanner.nextLine();
		System.out.println("입력한 비밀번호 : " + pw);
		
		// .eqauls()
		if(!id.equals("admin")) { // 없는 계정
			System.out.println("존재 하지 않는 계정");
		}
		// 있는 계정
		else if(pw.equals("1234")) { // 로그인 성공
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("비밀 번호 틀림");
		}
		
		// 2. 숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수 여부를 동시판별
		// 3의배수, 짝수, 3의배수이면서 짝수, 둘다 아닌경우
		int input = scanner.nextInt();
		boolean 삼의배수 = input % 3 == 0;
		boolean 짝수 = input % 2 == 0;
		
		if(삼의배수 && 짝수) {
			
		}
		else if(삼의배수){
			
		}
		else if(짝수){
			
		}
		else {
			
		}
		
		// 비트 마스크 플래그
		result = 0;
		result += 삼의배수 ? 1 : 0;
		result += 짝수 ? 2 : 0;
		String str = "";
		switch(result) {
		case 1:
			str += "3의 배수 ";
		case 2:
			str += "짝수 ";
		case 3:
			str += "3의 배수 짝수 ";
		}
		// 3. 월(month)을 입력받아서 계절을 출력
		// 예시 3~5월은 봄
		
		input = scanner.nextInt();
		switch (input) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("입력 범위 오류");
			break;
		}
		
		boolean ride = false;
		System.out.println(ride == true ? "탑승가능":"탑승불가");
		
		System.out.println(ride ? false : true);
		System.out.println(!ride);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
