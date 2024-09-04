package com.let.ex;
//x에서 y까지 점수 합과 그 결과가 짝/홀수인지 출력
public class Ex02_method {
	private static int sum(int from, int to) { //from부터 to까지 누적합 return
		int sum = 0; // 누적변수
		for(int i=from ; i<=to ; i++) {
			sum += i; // sum = sum+i;
		}
		return sum;
	}
	private static String evenOdd(int value) { //value가 짝수인지 홀수인지 return
		String result = (value%2==0) ? "짝수입니다" : "홀수입니다" ;
		return result;
//		if(value%2==0) {
//			return "짝수입니다";
//		}else {
//			return "홀수입니다";
//		}
	}
	public static void main(String[] args) {
		int tot = sum (1,10); // 누적변수
		System.out.println("1부터 10까지 정수의 합은 " + tot);
		System.out.println(evenOdd(tot));
		//-----------주---------------석----------------------
		tot = sum(10, 100); // 누적변수
		System.out.println("10부터 100까지 정수의 합은 " + tot);
		System.out.println(evenOdd(tot));
		//-----------주------석------------------------------------
		tot =sum (5, 10); // 누적변수
	
		System.out.println("5부터 10까지 정수의 합은 " + tot);
	}
}
