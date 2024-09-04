package com.lec.quiz;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //
		System.out.print("점수를 입력하세요 >");
		int su = sc.nextInt(); //키보드로부터 입력받은 점수를 변환하는 기능
		String result = (su%3 == 0) ? "3의 배수입니다":"3의 배수가 아닙니다";
		System.out.println("입력하신 수, " + su + "는 " + result);
		System.out.printf("입력하신 수, %d는 %s", su, result);
		sc.close(); // 스캐너변수 해제
		}
}