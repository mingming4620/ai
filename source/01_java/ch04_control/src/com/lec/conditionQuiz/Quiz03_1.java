package com.lec.conditionQuiz;
import java.util.Scanner;
public class Quiz03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)중 하나를 선택하세요 :");
		int you = scanner.nextInt(); // 0, 1, 2
		String youStr;
		switch (you) {
		case 0:
			youStr = "가위"; break;
		case 1:
			youStr = "바위"; break;
		case 2: 
			youStr = "보"; break;
		default:
			youStr = "유효하지 않은 값";
		}
	}
}