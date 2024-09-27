package com.lec.conditionQuiz;

import java.util.Scanner;

public class Quiz03_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)중 하나를 선택하세요 :");
		int you = scanner.nextInt(); // 0, 1, 2
		String youStr;
		youStr = (you == 0) ? "가위" : (you == 1) ? "바위" : (you == 2) ? "보" : "유효하지 않는 값";
		System.out.printf("당신은 %s를 내셨습니다", youStr);
		scanner.close();
	}
}