package service;

import domain.Customer;
import utils.BankUtils;

public class BankService {
	
	
	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	
	public void menu() {
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
			int no = BankUtils.nextInt("1. 로그아웃");
			switch(no) {
				case 1:
					customerService.logout(); break;
			}
		}
	}
}
