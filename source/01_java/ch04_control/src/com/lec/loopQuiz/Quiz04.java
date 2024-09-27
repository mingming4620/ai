package com.lec.loopQuiz;
// 2*1 = 2 3*1 = 3 .... 9*1 = 9
// ...
// 2*9 = 18 3*9 = 27 .... 9*9 = 31
public class Quiz04 {
	public static void main(String[] args) {
		for(int j = 1; j<=9 ; j++) {
			for(int i=2 ; i<=9 ; i++) {
			System.out.printf("%d * %d = %2d\t", i, j , i*j);
						}//for_2
			System.out.println(); // 개행
		}//for_1
	}//main
}//class


