package com.lec.codition;

import java.util.Scanner;

// 입력받은 수가 홀수인지 짝수인지 출력(if, switch, 삼항연산자)
public class Ex07 {
	public static void main(String[] args) {
//		String name = new String("HONG");
//		System.out.println(name.toLowerCase());
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");						
//		} 
		System.out.println( num%2==0 ? "짝수" : "홀수"); 
		switch(num%2){ // -1 0 1 
		case 0 :
			System.out.println("짝수"); break;
		default : 
			System.out.println("홀수"); break;
		}
	}
}
