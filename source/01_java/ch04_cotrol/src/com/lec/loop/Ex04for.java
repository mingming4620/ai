package com.lec.loop;
/* 
 * * 
 * * * 
 * * * *  
 * * * * */
public class Ex04for {
	public static void main(String[] args) {
		for(int i=0 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print('*');
			}
			System.out.println();// 개행만
		} // for-j
	} // main
} // class
