package com.lec.ex1_String;

import java.util.Scanner;

// 배열에 있는 전화번호 검색 
public class Ex05_searchTel {
	public static void main(String[] args) {
		String[] tel = {"010-5151-6262", "02-554-6262","010-5151-1515"};
		Scanner scanner = new Scanner(System.in);
		boolean noSearch = true; // 검색결과가 없으면 true. 검색결과가 있으면 false
		System.out.println("전화번호 뒷자리 : ");
		String searchTel = scanner.next(); // "6262"
		for(String t : tel) {
			int i = t.lastIndexOf("-"); 
			String postTel = t.substring(i+1);
			if(postTel.equals(searchTel)) {
				System.out.println("검색하신 전화번호 전체는" + t);
				noSearch = false;
			}
		}
//		for(int idx=0 ; idx<tel.length ; idx++) {
//			int i = tel[idx].lastIndexOf("-"); 
//			String postTel = tel[idx].substring(i+1);
//			if(postTel.equals(searchTel)) {
//				System.out.println("검색하신 전화번호 전체는" + tel[idx]);
//				noSearch = false;
//			}//if
//		}//for
		if(noSearch) {
			System.out.println("검색하신 전화번호가 없습니다.");
		}
	}//main
}
