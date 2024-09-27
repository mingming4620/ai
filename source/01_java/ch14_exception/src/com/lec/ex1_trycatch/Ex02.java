package com.lec.ex1_trycatch;

import java.util.Scanner;

// 사용자로부터 수 2개를 받아 사칙연산의 결과를 출력하자
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수는 ? ");
		int i = scanner.nextInt(); //InputMismatchException 에러메세지
		System.out.print("두번째 정수는 ?");
		int j = scanner.nextInt(); //InputMismatchException 에러메세지
		try {
			System.out.println("i/j =" + (i/j));//ArithmeticException 에러메세지 예외가 발생할 수 있는 부분		
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("i*j =" + (i*j));
		System.out.println("i+j =" + (i+j));
		System.out.println("i-j =" + (i-j));
		scanner.close();
	}
}

// 예외가 발생되면 자동적으로 예외 객체가 만들어짐 
// 예외가 발생될 만한 상황을 try 감싸야함 
// 예외가 발생하지 않으면 try를 수행하지않음으로 catch도 수행하지않음
// 예외가 발생하면 try 멈추고 catch로 진행함
// catch(에러메세지 변수) 감싸야됨
//
// getMassage로 오류 내용 메세지 뿌려야됨
