package com.lec.conditionQuiz;
//두 수 중 큰 수를 변수 max에 입력하고 변수 max를 출력하는 프로그램입니다. 잘못된 부분은?
public class Quiz02 {
	public static void main(String[] args) {
		int num1 = 27;
		int num2 = 32;
		// 방법1 : if블럭안의 max변수를 if블럭 전에 선언
		//int max;
		// 방법2 : if블럭안에 선언한 max변수를 if안에서 출력
		if (num1 > num2) {
			int max = num1;
			System.out.println(max); // alt+화살표 : 소스 한줄 줄옮김
		} else {
			int max = num2;
			System.out.println(max); // ctrl+alt+화살표 : 소스 한줄 복사
		}
	} // main
}
