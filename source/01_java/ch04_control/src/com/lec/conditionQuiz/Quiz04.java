package com.lec.conditionQuiz;
//컴퓨터와 가위바위보 게임을 하는 프로그램을 구현하시오. 단, 사용자는 가위를 내고자 할 때는 0을 입력하고 바위를 선택하고자 할 때는 1을 입력하고, 보를 선택하고자 할 때는 2를 입력하여 게임을 진행합니다
import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보 : ");
		int user = sc.nextInt();
		if (user == 0) {
			System.out.println("가위");
		}else if (user == 1) {
			System.out.println("바위");
		}else if (user == 2) {
			System.out.println("보");
		}else {
			System.out.println("다시내");
			System.exit(0);
		}
		int score = (int)(Math.random()*3);
		if (score == 0) {
			System.out.println("가위");
		}else if (score == 1) {
			System.out.println("바위");
		}else if (score == 2) {
			System.out.println("보");
		}else {
			System.out.println("다시내");
		}	
		if (user>score) {
			System.out.println("이겼다");
		}else if (user<score) {
			System.out.println("졌다");
		}else if (user==score) {
			System.out.println("비겼다");
		}//if
	}//main
}//class
