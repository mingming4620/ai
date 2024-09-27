package com.lec.condition;
// 실행할 때마다 컴퓨터가 난수(random) 정수를 발생하여 학점 출력
public class Ex06_switch_randomHakjum {
	public static void main(String[] args) {
		// 0<=Math.random()<1 : 실수 난수
		// 0<=Math.random()*101 < 101 : 실수 난수
		// 0<=(int)(Math.random()*101) <101 : 정수난수
		// 0<=Math.random()*45 < 45 : 0~45 : 실수 난수
		// 1<=((int)Math.random()*45+1) < 46 : 정수 난수
		// 50<= score < 101 : 정수 난수
		// 50<=Math.random()*51+50<101 : 실수 난수
		// 50<=(int)(Math.random()*51+50) <101 : 정수 난수
		int score = (int)(Math.random()*51+50);
		System.out.print(" 점수는 " + score + " - ");
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점"); break; // 제어문 탈출
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		case 6:
			System.out.println("D학점"); break;
		default:
			System.out.println("F학점"); 
			
//		System.out.println((int)(Math.random()*51+50));
		}
	}
}