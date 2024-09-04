package com.lec.ex;
// 실수는 double을 쓰자.
public class VarEx03 {
	public static void main(String[] args) {
		float f = 3.14159265359F; // 4byte
		double d = 3.14159265359; // 8byte
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		if (f == d) {
			System.out.println("f와 d값은 같다");
		}else {
			System.out.println("f와 d값은 다르다");
		}
		f = 10.1F;
		d = 10.1;
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		if (f == d) {
			System.out.println("f와 d값은 같다");
		}else {
			System.out.println("f와 d값은 다르다");
		}
	}
}






