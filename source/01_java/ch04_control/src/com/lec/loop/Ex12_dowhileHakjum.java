package com.lec.loop;

// 점수(0~100)를 입력받아 학점 출력(단, 유효하지 않은 점수를 입력할시 다시 입력 받음)
import java.util.Scanner;

public class Ex12_dowhileHakjum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		do {
			System.out.print("점수는?");
			score = scanner.nextInt();
			if (90 <= score && score <= 100) {
				System.out.println("A");
			}else if (80 <= score && score < 90) {
				System.out.println("B");
			}else if (70 <= score && score < 80) {
				System.out.println("C");
			}else if (60 <= score && score < 70) {
				System.out.println("D");
			}else if (0 <= score && score < 60) {
				System.out.println("F");
			}
		} while (0 > score || score > 100);
		scanner.close();
	}
}
