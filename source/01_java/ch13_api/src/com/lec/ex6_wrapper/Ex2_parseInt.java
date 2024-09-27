package com.lec.ex6_wrapper;

public class Ex2_parseInt {
	public static void main(String[] args) {
		System.out.println("문자열을 정수로 바꾸는 함수: Integer.parseInt(문자열)");
		int i = Integer.parseInt("10");
		System.out.println(i);
		System.out.println("정수를 문자열로 바꾸는 함수 : String.valueof(정수)");
		String str = 10 + ""; // "10"
		str = String.valueOf(10);
		System.out.println(str);
	}
}
