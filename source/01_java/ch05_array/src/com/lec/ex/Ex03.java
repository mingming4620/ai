package com.lec.ex;

public class Ex03 {
	public static void main(String[] args) {
		int i = 10; // 원본
		int j = i;// i를 copy본
		System.out.printf("i=%d, j%d\n", i, j);
		j = 99;
		System.out.printf("i=%d, j%d\n" , i, j);
		int[] score = {10, 20, 30, 40, 50};
		int[] s = score;
		for(int idx = 0; idx <score.length ; idx++) {
			System.out.printf("score[%d]=%d \t s[%d]=%d\n", idx, score[idx], idx, s[idx]);
		}
		s[0] = 99; // 변경후
		System.out.println("s[0]만 변경");
		for(int idx = 0; i<score.length ; idx++) {
			System.out.printf("score[%d]=%d \t s[%d]=%d\n", idx, score[idx], idx, s[idx]);
		}
	} 
}
