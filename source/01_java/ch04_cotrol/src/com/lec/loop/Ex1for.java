package com.lec.loop;
// 1~10까지 누척한 출력 : 55
// 1+2+3+4+5+6+7+8+9+10 = 55
public class Ex1for {
	public static void main(String[] args) {
		int total = 0;
		for(int i=1 ; i<=10 ; i++) {
			total += i; // total = total + i;
			if(i==10 ) {
				System.out.print(i + "=");
			}else {
				System.out.print(i + "+");
			}
		}		
		System.out.println(total);
	}
}
