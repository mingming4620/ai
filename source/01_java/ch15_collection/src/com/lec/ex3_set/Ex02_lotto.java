package com.lec.ex3_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

// Math.random(실수 난수) Random객체
public class Ex02_lotto {
	 public static void main(String[] args) {
		 Random random = new Random();
		 int[] lottoArr = new int[6];
		 // 발생된 난수를 배열에 할당
		 for(int i=0 ; i<lottoArr.length ; i++) {
			 lottoArr[i] = random.nextInt(45)+1;
		 }
		 // 배열 안의 값을 오름차순 정렬
		 for(int i=0 ; i<lottoArr.length-1 ; i++) {
			 for(int j=i+1 ; j<lottoArr.length ; j++) {
				 if(lottoArr[i] > lottoArr[j]) {
					 int temp = lottoArr[i];
					lottoArr[i] = lottoArr[j];
					lottoArr[j] = temp;
				 }//if
			}//for-i
		}//for-j
		 System.out.println("lottoArr : " + Arrays.toString(lottoArr));
//		 HashSet<Integer> lottoSet = new HashSet<Integer>();
		 TreeSet<Integer> lottoSet = new TreeSet<Integer>();
		 int count = 0;
		 while(lottoSet.size()<6) {
			 lottoSet.add(random.nextInt(45)+1);
			 count ++;
		 }//while
		 System.out.println(count + "번 뽑은 lottoSet : " + lottoSet);
	}//main
}
// Treeset : set에서 하는 sort 오름차순정렬
