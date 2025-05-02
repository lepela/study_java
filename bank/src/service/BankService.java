package service;

import domain.Customer;
import utils.BankUtils;

public class BankService {
	
	
	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService;
	}
	
	
	public void menu() {
		CustomerService customerService = CustomerService.getInstance();
		AccountService accountService = AccountService.getInstance();
		if(customerService.getLoginCustomer() == null) { // 
			int no = BankUtils.nextInt("1. 회원가입 2. 로그인");
			switch(no) {
				case 1:
					customerService.register(); break;
				case 2:
					customerService.login(); break;
			}
		}
		else { // 
			System.out.println("로그인 상태");
			int no = BankUtils.nextInt("1. 내정보 보기 2. 정보 수정 3. 회원탈퇴 4. 개설 5. 입금 6. 출금 7. 이체 8. 해지 9. 로그아웃");
			switch(no) {
				case 1:
					customerService.mypage(); break;
				case 2:
					customerService.modify(); break;
				case 3:
					customerService.remove(); break;
				case 4:
					accountService.open(); break;
				case 5:
					accountService.deposit(); break;
				case 6:
					accountService.withdraw(); break;
				case 7:
					accountService.transfer(); break;
				case 8:
					accountService.close(); break;
				case 9:
					customerService.logout(); break;
			}
		}
	}
}
