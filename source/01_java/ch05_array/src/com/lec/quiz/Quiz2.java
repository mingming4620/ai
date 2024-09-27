package com.lec.Quiz;
//배열에 담긴 값의 합계, 평균, 최대값, 최소값을 구하는 프로그램을 작성하시오.
//int[] arr =  { 10, 20, 30, 40, 50, 12, 13}  

public class Quiz2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 12, 13};
		int tot = 0;
		for (int idx=0 ; idx<arr.length ; idx++) {
			tot += arr[idx]; // 누적
		}
		System.out.println("합계" + tot);
		System.out.println("평균값 : " + (double) tot/arr.length);
		int max = -999, min = 999;
		
		for(int idx = 0; idx<arr.length ; idx++) {
			if(arr[idx]> max) {
				max = arr[idx];
			}// 최대값
			if(arr[idx]< min){
				min = arr[idx];
			}
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}
}


