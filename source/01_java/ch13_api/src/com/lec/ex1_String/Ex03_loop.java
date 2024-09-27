package com.lec.ex1_String;

import java.util.Scanner;

// I : 입력로직, U : 수정로직, X : 종료
public class Ex03_loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fn;
		do {
			System.out.print("I :입력, U : 수정, X : 종료");
			fn= scanner.next(); // 문자열 입력받을때 사용
			switch (fn) {
			case "I": case "i":
				System.out.println("입력로직수행"); break;
			case "U": case "u":
				System.out.println("수정로직수행");
			}
//		}while(! fn.equals("X") && !fn.equals("x"));
		}while( !fn.equalsIgnoreCase("x"));
		scanner.close();
		
	} // main
}


