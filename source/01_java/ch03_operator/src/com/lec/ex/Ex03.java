package com.lec.ex;
// 관계연산자(비교연산자) ; ==(같다) !=(다르다), >, >=, <, <= / 관계연산의 결과는 boolean
public class Ex03 {
	public static void main(String[] args) {
		int n1=10, n2=5;
		boolean result;
		result = n1>=n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		
		result = n1==n2;
		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);
		
		result = n1!=n2;
		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);
	}
}
