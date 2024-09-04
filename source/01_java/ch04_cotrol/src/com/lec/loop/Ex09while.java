package com.lec.loop;
// 1~100까지 숫자 중 3의 배수의 합을 출력
public class Ex09while {
	public static void main(String[] args) {
		int tot=0; // 누적변수
		int i=1;
		while(i<=100) {
			if(i%3 == 0) { // 3의 배수일 때만 누적(방법1)
			tot +=i;
			}
//			if(i%3 != 0) { // 방법2
//			i++;
//			continue;				
//		}
//		tot += i;
		i++;
			i++;
		}
		System.out.println(tot);
	} // main
}
