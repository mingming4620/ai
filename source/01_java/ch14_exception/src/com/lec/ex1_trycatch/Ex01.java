package com.lec.ex1_trycatch;

import java.util.Scanner;

// 사용자로부터 수 2개를 받아 사칙연산의 결과를 출력하자
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수는 ? ");
		int i = scanner.nextInt();
		System.out.print("두번째 정수는 ?");
		int j = scanner.nextInt();
		System.out.println("i/j =" + (i/j));//ArithmeticException 에러메세지
		System.out.println("i*j =" + (i*j));
		System.out.println("i+j =" + (i+j));
		System.out.println("i-j =" + (i-j));
		scanner.close();
	}
}

//예외가 발생되면 자동적으로 예외 객체가 만들어짐 