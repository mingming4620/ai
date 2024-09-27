package com.lec.ex;
// 관계(비교)연산자 : ==(같다), !=(다르다), >, >=, <, <= / 관계연산 결과는 boolean
public class Ex03 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 5;
		boolean result;
		result = n1>=n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		
		result = n1==n2;
		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);

		result = n1!=n2;
		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);
		
		result = !(n1!=n2); // !: 반대를 의미 (논리연산자)
		System.out.printf("!(%d %s %d) = %b\n", n1, "!=", n2, result);
	}
}
