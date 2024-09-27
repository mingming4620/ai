package com.lec.ex;

public class Ex01 {
	public static void main(String[] args) {
		int  i; //변수의 선언과 초기화 한번에
		// 1. 배열 변수 선언과 초기화
		int[] iArr = {10, 20, 30, 40, 50};
		iArr[2]=333; // 배열값의 접근은 index(0부터 시작)
		for(int idx=0; idx<iArr.length ; idx++) { // iArr.length : iArr 방의 갯수
			System.out.println(idx + "번째는 "+ iArr[idx]);
		}//for
		// 2. 배열 변수 선언과 배열 메모리 공간 확보
		int[] iArr2 = new int[5];
		for(int idx=0; idx<iArr.length ; idx++) { // 일반for문
			System.out.println("iArr2[" + idx + "] = " + iArr2[idx]);
		}
		// 3. 배열 변수 선언
		int[] arr;
		arr = new int[3];
		for(int a : arr ) { // 확장 for문 
			System.out.println(a);
		}
	}//main
}
