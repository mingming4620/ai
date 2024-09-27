package com.lec.loop;
/*
 **
 ***
 ****
 *****/
public class Ex04for {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}//for - j
			System.out.println(); // 개행만
		}// for - i
	}// main
}//class

