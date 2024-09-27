package com.lec.ex;
// x부터 y까지 정수 합과 그 결과가 짝/홀수인지 출력
public class Ex02_method {
	private static int sum(int from, int to) {// public 은 공유 private 은 이 파일 안에서만 사용  // from ~ to까지 누적합 return
		int sum = 0; //누적변수
		for(int i=from ; i<=to ; i++) {
			sum += i;
		}
		return sum;
	} //sum
	private static String evenOdd(int value) { // value가 짝수인지 홀수인지를 return
		String result = (value%2==0) ? "짝수입니다" : "홀수입니다";
		return result;
//		if (value%2== 0) {
//			return "짝수입니다";
//		}else {
//			return "홀수입니다";
//		}
		
	}
	
	public static void main(String[] args) {
		int tot = sum(1, 10);  //누적변수
		for(int i=1 ; i<= 10; i++) {
		}
		System.out.println("1~10 정수의 합은" +tot+ "입니다");
		System.out.println(evenOdd(tot));
		// -------------------------------------------------
		tot = sum(10, 100);  //누적변수
		for(int i=10 ; i<= 100; i++) {
		}
		System.out.println("10~100 정수의 합은" +tot+ "입니다");
		System.out.println(evenOdd(tot));
		//--------------------------------------------------
		tot = sum(5, 10);  //누적변수
		for(int i=5 ; i<= 10; i++) {
		}
		System.out.println("5~10 정수의 합은" +tot+ "입니다");
	}//main
}
