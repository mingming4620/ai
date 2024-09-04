package com.lec.ex;
// 비트연산 : &(and), |(or) => 정수를 비트끼리 연산
//논리연산자 : &&(and), ||(or) => true나 false끼리 연산
// true / false
public class Ex07 {
	public static void main(String[] args) {
		int n1 = 4; // 0 1 0 0
		int n2 = 7; // 0 1 1 1
		// 4 & 7 =     0 1 0 0 (4)
		// 4 | 7 = 	   0 1 1 1 (7)
		System.out.println("n1 & n2 = " + (n1 & n2));
		System.out.println("n1 | n2 = " + (n1 | n2));
	}
}
