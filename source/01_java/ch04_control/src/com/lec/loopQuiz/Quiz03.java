package com.lec.loopQuiz;
// 사용자로부터 원하는 구구단 수 입력받아 해당 구구단만 출력
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단 구구단을 출력할까요?");
		int dansu = sc.nextInt();
		for (int i = 1 ; i <= 9 ; i++ ) {
			System.out.printf("%d * %d = %2d\n", i,dansu,i*dansu);
		}
	}
}

