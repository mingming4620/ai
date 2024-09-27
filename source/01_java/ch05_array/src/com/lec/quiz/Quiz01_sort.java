package com.lec.Quiz;

import java.util.Arrays;

// 배열의 오름차순 정렬
//76,45,34,89,50  5개의 값을 배열로 초기화 하고 이들 값들을 크기 순으로 나타내는 프로그램을 작성 하시오
public class Quiz01_sort {
	public static void main(String[] args) {
		int[] arr = {76, 45, 34, 89, 50};
//		for(int a : arr) {
//			System.out.print(a + "\t");
//		} // 정렬 전
		System.out.println("정렬전 : " + Arrays.toString(arr));
		// 정렬 시작
		for(int i =0 ; i<arr.length; i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //내림차순은 부등호만 바꾸면됨
					// i번째와 j번째 바꿔
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; //임시 변수 temp 많이 씀
				}//if
			}//for
		}//for
		System.out.println("정렬후 : " + Arrays.toString(arr));
	}
}
