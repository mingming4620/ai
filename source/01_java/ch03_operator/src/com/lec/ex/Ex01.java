package com.lec.ex;
// 산술연산자 : + - * / %(나머지연산자)
// 산술연산시 : 4byte와 4byte간의 산술연산 결과는 4byte
// 			8byte와 4byte간의 산술연산 결과는 8byte
public class Ex01 {
	public static void main(String[] args) {
		int n1 = 33, n2 = 10;
		int result;
		double resultdouble;
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);	
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);	
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);	
		resultdouble = (double)n1 / n2; // 8byte값/4byte값 => 8byte
		result = n1 / n2;
		System.out.printf("%d %c %d = %d(정수결과)\n", n1, '/', n2, result);
		System.out.printf("%d %c %d = %.1f(실수결과)\n", n1, '/', n2, resultdouble);
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);
		// 나머지 연산자의 용도 : 짝홀수 판별 , n의 배수 판별 
		if( n1%2 == 0 ) {
			System.out.println("n1은 짝수입니다");
		}else {
			System.out.println("n1은 홀수입니다");
		}
		if ( n1%5 == 0 ) {
			System.out.println("n1은 5의 배수입니다.");
		}else {
			System.out.println("n1은 5의 배수가 아닙니다");
		}
	}
}


