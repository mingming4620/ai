package com.lec.condition;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num = scanner.nextInt();
		// if
//		if (num%2 ==0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
		// 3항연산자
		//		System.out.println(num%2 ==0 ? "짝수입니다" : "홀수입니다");
////		("정수를 입력하세요>") ? "true" : "false"
//		switch
		switch(num%2) { // -1 0 1
		case 0 :
			System.out.println("짝수"); break;
		default :
			System.out.println("홀수");
		}
	}
}
