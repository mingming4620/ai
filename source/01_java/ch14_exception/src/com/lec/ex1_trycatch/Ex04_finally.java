package com.lec.ex1_trycatch;

public class Ex04_finally {
	public static void main(String[] args) {
		int[] arr = {0,1,2};
		for(int i=0 ; i<=arr.length ; i++) {
		try {
			System.out.println("arr[" + i + "] = " +arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 메세지 :" + e.getMessage());
		}catch(Exception e) {
			
		}finally { // try절에 사용될 코드를 작성
			System.out.println("try절 실행후에도, catch 절 실행후에도 실행되는 절 \n");
		}
		}
	}
}
