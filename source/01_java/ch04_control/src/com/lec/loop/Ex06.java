package com.lec.loop;
// 반복문 (loop문)을 작성할때는 무한반복문(loop)에 빠지지 않도록 주의
public class Ex06 {
	public static void main(String[] args) {
		for(int i = 1 ; ; i++) { // 무한반복문 조건 실행 코드가 없음)
			System.out.println(i + ",안녕");
			if(i == 10) break;// 반복문 빠져나옴
		}
		System.out.println("실행 안 됨");
	}
}