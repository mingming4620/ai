package com.lec.loopQuiz;
//1~10까지의 곱의 결과를 출력해 보자(for문이용)
public class Quiz01 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1 ; i <= 10 ; i++) {
				sum *= i;
			}
		System.out.println(sum);
	} 
	}

