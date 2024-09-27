package com.lec.Quiz;

import java.util.Scanner;

//사용자로 부터 구구단 수를 입력받아 gugudanout(입력받은수) 호출
public class Qui01_gugudan {
	private static void gugudanOut(int dansu) {
		for(int i=1; i<=9 ; i++) {
//			System.out.println(dansu +'*' + i + "=" + dansu*i);
			System.out.printf("%d x %d = %d\n", dansu, i, dansu*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("구구단 단수를 입력하세요 : ");
		int dansu = sc.nextInt();
		System.out.println("입력하신 단수는" + dansu);
		gugudanOut(dansu);

	}
}

