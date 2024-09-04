package com.lec.ex;
// 형변환 = 묵시적 형변환 + 명시적 형변환
public class VarEx05 {
	public static void main(String[] args) {
		long l = 2200000000L;
		int i=10;
		double d = i; // 묵시적 형변환(공간이 큰 변수에 공간이 작은 값을 할당)
		System.out.println("d = " + d);
		i = (int)10.6; // 명시적 형변환 - 데이터 손실이 생길 수 있다
		System.out.println("i = " + i);
	}
}
