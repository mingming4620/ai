package com.lec.ex;
// println() : 콘솔창 출력(개행포함)
// printf() : 콘솔창 출력(포맷 지정. 개행\n 미포함)
// print() : 콘솔창 출력(개행이 미포함된 println)
public class VarEx02 {
	public static void main(String[] args) {
		int i = 10;
		byte j = -127;
		double h = 10.15;
		boolean b = false; // true
		System.out.println("i=" + i +"\t j=" + j + "\t h=" + h);
		// %d(정수), %f(실수), %c(문자), %s(문자열), %b(boolean) 
		System.out.printf("i=%d, j=%d, h=%6.1f, b=%b\n", i, j, h, b);
		char c1 = 'A';
		char c2 = '홍';
		System.out.printf("c1=%c \t c2=%c\n", c1, c2);
		System.out.printf("c1=%d \t c2=%d\n", (int)c1, (int)c2);
		System.out.println("끝");
	}
}



