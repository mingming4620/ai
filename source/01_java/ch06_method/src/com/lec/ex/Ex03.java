package com.lec.ex;

import Exex.Arithmeric;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("-9의 절대값 :" + Arithmeric.abs(-9));
		Arithmeric ar = new Arithmeric();
		int tot = ar.sum(100);
		System.out.println("합은" + tot);
		System.out.println(ar.evenOdd(tot));
	}//main
}
