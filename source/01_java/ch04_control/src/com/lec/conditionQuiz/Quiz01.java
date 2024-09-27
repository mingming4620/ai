package com.lec.conditionQuiz;

//수를 입력받아 절대값을 출력하는 프로그램
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int num = scnner.nextInt();
		
		if 	(num < 0) {
			System.out.printf("절대값은 %d", (num*-1));
		}else {
			System.out.printf("절대값은 %d", num);
		}
	}
}
