package com.lec.quiz;
// 국어,영어,수학 점수를 할당하고, 각 점수와 총점을 출력
public class Example {
 public static void main(String[] args) {
//	 int kor = 95, eng = 100, mat = 98; // 국영수
	 int kor = 95;
	 int eng = 100;
	 int mat = 98;
	 int tot = kor + eng + mat; // tot = 293;
	 System.out.println("국어: " + kor + "\t영어: "+ eng + "\t수학 : " + mat + "\n총점 : " + tot);
 }
}