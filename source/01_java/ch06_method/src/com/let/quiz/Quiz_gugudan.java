package com.let.quiz;
import java.util.Scanner;
// 사용자로부터 구구단의 수를 입력받아 gugudanOut(입력받은 수) 호출 -> 호출한 메소드에서 대항 구구단 출력
public class Quiz_gugudan {
		private static void gugudanOut(int value) {
		for (int i=1 ; i<=9 ; i++) {
				//System.out.println(value + "*" + i + "=" + value*i);
				System.out.printf("%d X %d = %d\n", value, i, value*i);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단 수는 > ");
		int dansu = scanner.nextInt();
		System.out.println("입력하신 구구단 수는 " + dansu);
		gugudanOut(dansu);
		
	}
}



