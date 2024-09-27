package com.lec.ex1_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//첫번째 정수를 제대로 입력할 때까지 입력받음. 
//두번째 정수를 제대로 입력하지 않으면 1로 할당 받고 곱셈, 덧셈, 뺄셈을 출력
// 사용자로부터 수 2개를 받아 사칙연산의 결과를 출력하자
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, j = 1;
		do {
			try {
				System.out.print("첫번째 정수는 ? ");
				i = scanner.nextInt(); // InputMismatchException 에러메세지
				break;
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scanner.nextLine(); // 버퍼 지우는 목적
			}
		}while(true);
		System.out.print("두번째 정수는 ? ");
		try {
			j = scanner.nextInt(); // InputMismatchException 에러메세지
			System.out.println("i/j =" + (i / j));// ArithmeticException 에러메세지 
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수는 없습니다 : " +e.getMessage());
		}catch (Exception e) {
			System.out.println("두번째 정수를 잘못 입력하셨습니다 1로 처리합니다.");
		}
		System.out.println("i*j =" + (i * j));
		System.out.println("i+j =" + (i + j));
		System.out.println("i-j =" + (i - j));
		scanner.close();
	}
}

// 예외가 발생되면 자동적으로 예외 객체가 만들어짐 
// 예외가 발생될 만한 상황을 try 감싸야함 
// 예외가 발생하지 않으면 try를 수행하지않음으로 catch도 수행하지않음
// 예외가 발생하면 try 멈추고 catch로 진행함
// catch(에러메세지 변수) 감싸야됨
//	scanner.nextLine(); // 버퍼 지우기
// getMassage로 오류 내용 메세지 뿌려야됨
// 예외객체가 생성이되면 catch절부터 확인