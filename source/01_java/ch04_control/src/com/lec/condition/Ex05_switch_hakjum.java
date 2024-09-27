package com.lec.condition;
// 점수(0~100)를 입력받아 학점 출력
import java.util.Scanner;
public class Ex05_switch_hakjum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("점수는?");
		int score = scanner.nextInt();
		int temp = score == 100? score-1 : score; // temp에는 score가 100일때만 99할당. 그외엔 score와 동일 값 할당
		switch(temp/10) {
		case 9:
			System.out.println("A학점"); break;
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		case 6:
			System.out.println("D학점"); break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F학점");
		default:
			System.out.println("유효하지 않은 점수입니다");
		}
			scanner.close();
	}
}
