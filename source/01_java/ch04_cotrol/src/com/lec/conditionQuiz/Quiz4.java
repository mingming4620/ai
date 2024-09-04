package com.lec.conditionQuiz;

import java.util.Scanner;

// 사용자에게 가위(0), 바위(1), 보(2) 입력받는다
// 	1. 0~2사이의 수를 입력 안 한 경우 : 프로그램 강제종료
//	2. 0~2사이의 수를 입력 한 경우(if, switch, 삼항연산자)
//			(1) 컴퓨터가 0~2사이의 난수를 발생
//			(2)당신과 컴퓨터가 낸 가위바위보 출력 (ex. 당신 가위, 컴퓨터는 바위)
//			(3) 가위바위보 결과 출력(ex 당신이 졌습니다 ㅠ.ㅠ) 
public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
		int you = sc.nextInt();
		if(you<0 || you>2) {
			System.out.println("떼끼");
			System.exit(0);// 프로그램 정상 강제 종료
		}
		String youStr = (you==0) ? "가위": (you==1) ? "바위":"보" ;
		
//		if(you==0) {
//			youStr = "가위";
//		}else if(you==1){
//			youStr = "바위";
//		}else {
//			youStr = "보";
//		}
		int com = 1; // 0~2사이의 정수 난수;
		// 컴퓨터도 0~2 난수 0 <= Math.random()*3 < 3
		String comStr = (com==0) ? "가위": (com==1) ? "바위":"보" ;
		System.out.println("당신은 " + youStr);
	}	
}
