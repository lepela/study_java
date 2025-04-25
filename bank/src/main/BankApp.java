package main;

import service.BankService;
import utils.BankUtils;

public class BankApp {
	public static void main(String[] args) {
		while(true) {
			System.out.println("  _______   _   ____          _   _ _  __\r\n"
					+ " |__   __| | | |  _ \\   /\\   | \\ | | |/ /\r\n"
					+ "    | |    | | | |_) | /  \\  |  \\| | ' / \r\n"
					+ "    | |_   | | |  _ < / /\\ \\ | . ` |  <  \r\n"
					+ "    | | |__| | | |_) / ____ \\| |\\  | . \\ \r\n"
					+ "    |_|\\____/  |____/_/    \\_\\_| \\_|_|\\_\\");
			System.out.println("=================================================");
			BankService.getInstance().menu();
		}
	}
}
