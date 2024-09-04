package com.lec.conditionQuiz;

import java.util.Scanner;
// 절대값을 
public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수는?");
		int num = scanner.nextInt();
		if(num<0) {
			System.out.println(-num);
		}else {
			System.out.println(num);
		}
	}
}
