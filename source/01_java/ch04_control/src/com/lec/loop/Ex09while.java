package com.lec.loop;
// 1~100까지 숫자중 3의 배수의 합을 출력
public class Ex09while {
	public static void main(String[] args) {
		int tot = 0; //누적변수
		int i = 1; // 초기화값
		while ( i <= 100) { // 방법1 추천**
			if(i%3==0) { // if문의 참일경우 3의 배수일때만 누적 // 방법1 추천**
				tot += i;
			} // if
//			if (i%3 !=0) { //방법2
//				i++;
//				continue;
//			}// if
//			tot += i;
			i++;
		} // while 
		System.out.println(tot);
	} // main
} //  class