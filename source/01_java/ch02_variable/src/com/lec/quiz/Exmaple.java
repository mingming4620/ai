package com.lec.quiz;
// 국어, 영어, 수학 점수를 할당하고, 각 점수와 총점을 출력
public class Exmaple {
	public static void main(String[] args) {
//		int kor = 100, eng = 90, mat = 100; // 국, 영, 수
		int kor = 100;
		int eng = 90;
		int mat = 100;
		int tot = kor + eng + mat; // tot = 290;
		System.out.println("국어 : " + kor +"\t수학 : " + mat);
		System.out.println("수학 : " + mat );
		System.out.println("영어 : " + eng );
		System.out.println("총점 : " + tot );
	}
}
