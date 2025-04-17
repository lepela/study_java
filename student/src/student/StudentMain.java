package student;

public class StudentMain {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		System.out.println("================== 학생 점수 관리 프로그램 ==================");
		for(;;) {
			switch (StudentUtils.nextInt("1. 등록 2. 조회 3. 수정 4. 삭제 5. 과목별 평균 6. 석차순 조회 7. 종료")) {
			case 1:
				service.register();
				break;
			case 2:
				service.read();
				break;
			case 3:
				service.modify();
				break;
			case 4:
				service.remove();
				break;
			case 5:
				System.out.println("bye~!");
				return;
			default:
				break;
			}
		}
	}
}
