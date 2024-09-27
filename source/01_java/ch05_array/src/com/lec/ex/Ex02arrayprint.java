package com.lec.ex;

public class Ex02arrayprint {
	public static void main(String[] args) {
		int [] arr = {0, 0, 0};
		// 확장 for을 이용한 출력 배열 출력을 할경우 사용
		for(int a : arr) {
			System.out.println(a);
		}
		// 일반 for문을 이용한 배열값 변경
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = 99;
		}
		System.out.println("일반 for문을 이용한 배열값 변경");
		for(int a: arr) {
			System.out.println(a);			
		}
		// 확장 for문을 이용한 배열값 변경 안됨 
		for(int temp : arr) {
			temp = 55;
		}
		System.out.println("확장 for문을 이용한 배열값 변경은 무효 임시변수 (temp)만바뀜");	
		for(int a : arr) {
			System.out.println(a);	
	}
}
}