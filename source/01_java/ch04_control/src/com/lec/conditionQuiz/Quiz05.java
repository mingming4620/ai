package com.lec.conditionQuiz;

import java.util.Scanner;
//현재 몇월인지를 키보드로부터 입력받아 계절을 출력하는 프로그램을 구현하세요
public class Quiz05 {
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
	System.out.print("현재 몇월입니까 : ");
	int calender = sc.nextInt();
	String cld;
	if (1<= calender && calender <=3) {
//		System.out.println("봄입니다");
		cld = "봄";
	}else if (3< calender && calender <=6) {
//		System.out.println("여름입니다");
		cld = "여름";
	}else if (6< calender && calender <=9) {
//		System.out.println("가을입니다");
		cld = "가을";
	}else if (9< calender && calender <=12) {
//		System.out.println("겨울입니다");
		cld = "겨울";
	}else {
//		System.out.println("잘못입력했습니다");
		cld = "다시입력";
	}
		System.out.printf("%s", cld);
	}
}

