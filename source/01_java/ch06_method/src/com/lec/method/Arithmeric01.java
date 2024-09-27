package com.lec.method;
//sum(10, 100) sum(10) (매개변수는 1개에서 2개까지만 ) - 함수 오버로딩 / evenOdd(10) / abs(-9) 
public class Arithmeric01 {
	public static int abs(int value) {
		int result = (value >= 0) ? value : -value;
		return result;
	}
	public int sum(int from, int to) {
		int sum = 0;
		for(int i=from ; i<= to ; i++) {
			sum += i;
		}
		return sum;
	}
	public int sum(int to) {
		int result = 0;
		for(int i=1; i<=to ; i++) {
			result += i;
		}
		return result;
	}
	public String evenOdd(int value) {
		String result = (value%2 ==0) ? "짝수입니다" : "홀수입니다";
		return result;
	}
}
