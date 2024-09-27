package com.lec.ex3_eceptions;

public class Ex01_NullPointEx {
	public static void main(String[] args) {
		String greeting = "hello";
		System.out.println(greeting.substring(2)); // 2번째부터 출력 
		greeting = null;
		System.out.println(greeting.substring(2));
	}
}
