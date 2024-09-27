package com.lec.ex;
// 삼항(3항)연산자 : (조건식)? (조건식이 참일 경우 취할 값) : (조건이 거짓일경우 취할 값);
public class Ex05 {
	public static void main(String[] args) {
		int h =100;
		String result; // 짝홀수 여부의 결과
		result = (h%2 == 0) ? "짝수입니다" : "홀수입니다"; // 3항 연산자
//		if(h%2 == 0) {
//			result = "짝수입니다";
//		}else {
//			result = "홀수입니다";
//		}
		System.out.println(result);
	}
}
