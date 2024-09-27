package com.lec.quiz;
// 국어, 영어, 수학 점수를 사용자에게 입력받아, 각 점수를 출력하고 총점, 평균(소수점2자리까지) 출력하는 프로그램을 구현 하시오
import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요");
		int mat = sc.nextInt();
		System.out.printf("kor = %d eng = %d mat =  %d\n", kor,eng,mat);
		int result = kor + eng + mat;
//		int sum = kor + eng+ mat; 
		System.out.printf("총 합계 점수는> %d\n" , result);
//		System.out.printf("총 합계 점수는> %d" , sum);
		double tot = (double)result / 3;
//		double tot = (double)sum / 3;
//		double tot = sum / 3.0;
		System.out.printf("평균 점수는 > %.2f", tot);
	}
}

