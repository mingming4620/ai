package com.lec.ex7_customer;

public class TestMain {
	public static void main(String[] args) {
		Customer customer = new Customer("홍길동","010-9999-9999", "서울", "01-01");
		customer.buy(500000);
		System.out.println("============================");
		customer.buy(500000);
		Staff staff = new Staff("홍사원", "010-9999-8888", "개발");
		Person[] person = {customer, staff};
		for(Person p : person) {
			System.out.println(p.infoString());
		}
	}
}
