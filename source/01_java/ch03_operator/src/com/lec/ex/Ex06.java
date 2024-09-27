package com.lec.ex;
// 할당(대입)연산자 : =, +=, -=, *=, .... (우결합성)
public class Ex06 {
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 2; // n1 = n1 + n2;
		System.out.println("n1 = " + n1);
		n1 *= 2; // n1 = n1 * n2;
		System.out.println("n1 = " + n1);
		int n2, n3;
		n2 = n3 = n1 = 10; // 우결합성 n1, n2 , n3 전부 10
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
	} 
}
