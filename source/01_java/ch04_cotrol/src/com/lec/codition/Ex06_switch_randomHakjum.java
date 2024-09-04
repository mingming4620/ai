package com.lec.codition;
// 실행할 때 마다 컴퓨터 난수(random) 점수를 발생하여 학점 출력
public class Ex06_switch_randomHakjum {
	public static void main(String[] args) {
		// 0 <= Math.random() < 1 : 실수 난수
		// 0 <= Math.random()*51 < 51 : 실수 난수
		// 50 <= Maht.random()*51+51 < 101 : 실수
		// 50 <=(int)(Math.random()*51 + 50) < 101 : 정수 (50~100)
		// 0 <= Math.random()*101 < 101 : 실수 난수
		// 0 <= (int)(Math.random()*101) < 101 : 정수 난수 (0~100)
		// 0 <= Math.random()*45 < 45 : 실수 
		// 1 <= (int)(Math.random()*45+1) < 46 : 정수
		int score = (int)(Math.random()*101);
		System.out.print( "점수는 " + score + " - ");
		switch(score/10) {
		case 10:		
		case 9:
			System.out.println("A학점"); 
		case 8:
			System.out.println("B학점"); 
		case 7:
			System.out.println("C학점"); 
		case 6:
			System.out.println("D학점");
		default:
			System.out.println("F학점"); 
		}
	}
}
