package com.lec.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerArrayListMain {
	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("회원가입하시겠습니까 (y/n) ? ");
			String answer = scanner.next();
			if(answer.equalsIgnoreCase("n")) break;
			System.out.print("이름을 입력해 주세요 : ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("전화번호를 입력해 주세요 : ");
			String tel = scanner.nextLine();
			System.out.print("주소를 입력해 주세요 : ");
			String address = scanner.nextLine();
			customer.add(new Customer(name,tel,address));	
		}
		if(customer.size() ==0) {
			System.out.println("회원정보가 없습니다.");
		}else
			System.out.println("가입된 회원 정보는 : ");
		for(int i=0 ; i<customer.size(); i++) {
			System.out.println(customer.get(i));
		}
		scanner.close();

	}

}
