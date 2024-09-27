package com.lec.loop;
// 1~10까지 누척합을 출력
public class Ex08while {
	public static void main(String[] args) {
		int i = 0;
		int tot = 0; //누적합 변수
		while ( i <=10 ) {
			tot += i; // tot = tot + i
			System.out.printf("i가 %d일때 까지의 누적합은 %d \n", i, tot);
			i++;
		}
	}
}
