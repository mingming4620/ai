package com.lec.ex1_String;

import java.util.Scanner;

// quis : 전화번호를 (010-9999-9999) 입력받아 전화번호, 짝수번째문자, 거꾸출, 국번, 뒷4자리 출력 (x를 입력할때까지 반복)
public class Ex04_tel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("전화번호(xxx-xxxx-xxxx), 단 종료시 x :");
			String tel = scanner.next(); // "010-9999-9999"
			if(tel.equalsIgnoreCase("x"))  break; // 반복문 종료 조건
			// 전화번호 출력 (tel출력)
			System.out.println("전화번호는 : " + tel);
			// 짝수번째 문자열 출력 length(), charAt(), 일반 for문 이용
			System.out.print("짝수번째 숫자 출력");
			for(int i=0 ; i<tel.length() ; i++) {
				if(i%2==0) {
					System.out.print(tel.charAt(i)+",");
				}	
		}
			System.out.println();
			// 거꾸로 출력 length(), charAt(), 일반 for문 이용 확장for문은 배열에서만 가능
			for(int i=tel.length()-1 ; i>=0 ; i--) {
					System.out.print(tel.charAt(i));					
				}
			System.out.println();
			// 전화번호 앞자리 출력 indexOf(), substring() 이용
			int idx = tel.indexOf("-"); // "-"오는 인덱스 번호
			if(idx !=-1) {
			String preTel = tel.substring(0, tel.indexOf("-"));
			System.out.println("앞자리만 : "+ preTel);
			System.out.println();
			// 전화번호 뒷자리 출력 lastIndexOf(), substring() 이용
			String postTel = tel.substring(tel.lastIndexOf("-")+1);
			System.out.println("뒷자리만 :" + postTel);
			}
		}
			
		
	}

}
