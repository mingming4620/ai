package com.lec.loopQuiz;

public class Quiz02 {
	public static void main(String[] args) {
		int oddTotal = 0; // 홀수 누적 변수
		int evenTotal = 0; // 짝수 누적 변수
		for(int i=1 ; i<11 ; i++) {
			if(i%2 == 0) {
				evenTotal += i;
			}else {
				oddTotal += i;
			}
		}//for
		System.out.println("1~10까지의 홀수의 합은 "+oddTotal +", 짝수의 합은 "+evenTotal);
	}//main
}

