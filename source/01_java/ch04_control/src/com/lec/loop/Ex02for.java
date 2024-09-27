package com.lec.loop;
// 1~10까지 누적합 출력 1+2+3+...+9+10
// 1+2+3+4+5+6+7+8+9+10 = 55
public class Ex02for {
	public static void main(String[] args) {
		int total = 0;
		for(int num = 1 ; num<=10 ; num++ ) {
		
			total += num; //total = total +i 
			if (num==10) {
				System.out.print( num + "=");
			}else {
				System.out.print(num + "+");
			}//if
			
		}//for
		System.out.println(total);
	}//main
}//class
