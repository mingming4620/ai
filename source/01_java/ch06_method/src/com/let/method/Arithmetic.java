package com.let.method;
// sum(10, 100), sum(10) = 함수 오버로딩 / evenOdd(10) / abs(-9)
public class Arithmetic {
	public static int abs(int value) { // value의 절대값을 return
		int result = (value>=0)? value : -value;
		return result;
	}
	public int sum(int from, int to) { //from부터 to까지 누적합 return
		int sum = 0; // 누적변수
		for(int i=from ; i<=to ; i++) {
			sum += i; // sum = sum+i;
		}
		return sum;
	}
	public int sum(int to) { //1부터 to까지 누척합 return
		int result = 0;
		for(int i=1 ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
	
	public String evenOdd(int value) { //value가 짝수인지 홀수인지 return
		String result = (value%2==0) ? "짝수입니다" : "홀수입니다" ;
		return result;
//		if(value%2==0) {
//			return "짝수입니다";
//		}else {
//			return "홀수입니다";
//		}
	}
}
