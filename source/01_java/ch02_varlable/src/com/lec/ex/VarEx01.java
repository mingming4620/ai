package com.lec.ex;

public class VarEx01 {
	public static void main(String[] args) {
		// 변수타입 변수명 = 값;
		int age = 27; // 4byte 정수 1byte = 8bit (소문자로 시작하는 변수는 기본데이터타입 기본변수)
		// age = 27.5; 변수타입과 다른 값
		String name = "제니"; // 대문자로 시작하는변수는 ((객체타입변수) 참조데이터타입 객체/참조변수)
		System.out.println("안녕하세요. " + age + "살 "+ name + "씨");// ctrl + alt + ↓
		System.out.println("안녕하세요. " + age + "살 "+ name + "씨");// ctrl + alt + ↓
		System.out.println("안녕하세요. " + age + "살 "+ name + "씨");// ctrl + alt + ↓
		age = 28; name="홍길동";
		System.out.println("안녕하세요. " + age + "살 "+ name + "씨");// ctrl + alt + ↓
		System.out.println("안녕하세요. " + age + "살 "+ name + "씨");// ctrl + alt + ↓
	}
}
