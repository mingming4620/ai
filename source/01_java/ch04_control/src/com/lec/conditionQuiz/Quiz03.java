package com.lec.conditionQuiz;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력: ");
		int you = sc.nextInt();
		String user;
		if (you == 0) {
			user = "가위";
		}else if (you == 1) {
			user = "바위";
		}else if ( you == 2) {
			user = "보";
		}else {
			user = "잘못입력하셨습니다";
		} // if
		System.out.println("당신은" + user);
	}//main
}//class
