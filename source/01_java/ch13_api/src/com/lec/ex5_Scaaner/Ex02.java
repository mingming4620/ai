package com.lec.ex5_Scaaner;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("주소 :");
//		scanner.nextLine(); //버퍼에 남아있는 내용과 "\n" 지우는 용도 nextLine 하기전에 초기화
		String address = scanner.nextLine(); // "\n" 앞이 값을 return하고 나머지는 버퍼에서 지움
		System.out.println("입력한 주소 :" + address);
		
		System.out.print("이름 :");
		String name = scanner.nextLine(); // white space(space, tab, \n)앞 까지만 return하고 나머지는 버퍼에 남음 버퍼(저장공간)
		System.out.println("입력한 이름 :" + name);
		
		System.out.print("나이 :");
		int age = scanner.nextInt();
		System.out.println("입력한 나이 :" + age);
		
	}

}
