package com.let.ex4_account;
public class AccountTestMain {
	public static void main(String[] args) {
		Account hong = new Account("100-1", "홍길동");
		hong.deposite(100);
		try {
		hong.withdraw(150);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		hong.infoPrint();
		System.out.println(hong.infoString());
		Account hong1 = new Account("010-2", "홍길순", 2200000000L);
		try {
			hong1.withdraw(2000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(hong1.infoString());
	}
}
