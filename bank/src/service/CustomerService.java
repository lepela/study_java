package service;

import java.util.ArrayList;
import static utils.BankUtils.*;
import java.util.List;

import domain.Customer;
import utils.BankUtils;

public class CustomerService {
	private List<Customer> customers = new ArrayList<Customer>();
	private Customer loginCustomer; // 
	
	private static CustomerService customerService = new CustomerService();
	private CustomerService() {}
	public static CustomerService getInstance() {
		return customerService;
	}
//	private AccountService accountService = AccountService.getInstance();
	
	{
		customers.add(new Customer(1, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
	}
	
	// loginCustomer의 getter
	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	
	public void register() {
		System.out.println("회원가입");
		String name = nextLine("이름 > "); // 이름
		String tel = nextLine("전화번호(ex : 010-1111-2222) > ");
		String email = nextLine("이메일 > ");
		String id = nextLine("아이디 > ");
		String pw = nextLine("비밀번호 > ");
		int no = 1;
		if(!customers.isEmpty()) {
			no = customers.get(customers.size()-1).getNo()+1;
		}
		Customer customer = new Customer(no, name, tel, email, id, pw);
		customers.add(customer);
		
		System.out.println("회원 가입 완료");
	}
	public void mypage() {
		System.out.println("내정보보기");
		System.out.println(loginCustomer);
		System.out.println("계좌 정보 조회");
		AccountService.getInstance().print(AccountService.getInstance().findAccountsBy(loginCustomer)); 
	}
	public void modify() {
		System.out.println("정보수정");
		String id = nextLine("아이디 > ");
		Customer c = findById(id);
		if(c == null) {
			System.out.println("회원정보 없음");
			return;
		}
		
		String name = nextLine("이름 > "); // 이름
		String tel = nextLine("전화번호(ex : 010-1111-2222) > ");
		String email = nextLine("이메일 > ");
		String pw = nextLine("비밀번호 > ");
		
		c.setName(name);
		c.setTel(tel);
		c.setEmail(email);
		c.setPw(pw);
	}
	public void remove() {
		System.out.println("탈퇴");
		
		// 만약 계좌가 존재하면?
		if(!AccountService.getInstance().findAccountsBy(loginCustomer).isEmpty()) {
			System.out.println("계좌가 존재합니다. 해지 후 탈퇴 진행하세요");
			return;
		}
		
		if(!nextConfirm("탈퇴하시겠습니까?")) {
			return;
		}
		customers.remove(loginCustomer);
		logout();
	}
	public Customer findBy(int no) {
		for(Customer c : customers) {
			if(c.getNo() == no) {
				return c; 
			}
		}
		return null;
	}
	public Customer findById(String id) {
		for(Customer c : customers) {
			if(c.getId().equals(id)) {
				return c; 
			}
		}
		return null;
	}
	
	public void login() {
		String id = nextLine("아이디 > ");
		String pw = nextLine("비밀번호 > ");
		
		boolean flag = false;
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
	}
	public void logout() {
		loginCustomer = null;
		System.out.println("로그아웃 되었습니다");
	}
 }
