package com.lec.ex2_map;

import java.util.HashMap;
import java.util.Scanner;

import com.lec.ex1_list.Friend;

public class Ex03_FriendHashMapTelseatch {
	 public static void main(String[] args) {
		HashMap<String, Friend> friends = new HashMap<String, Friend>();
		friends.put("010-9999-9999", new Friend("홍길동", "010-9999-9999"));
		friends.put("010-8888-8888", new Friend("김길동", "010-8888-8888"));
		friends.put("010-7777-7777", new Friend("신길동", "010-7777-7777"));
		friends.put("010-6666-6666", new Friend("이길동", "010-6666-6666"));
		friends.put("010-5555-5555", new Friend("박길동", "010-5555-5555"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색하고자 하는 전화번호를 입력하세요 (단 종료는 x) : ");
			String searchTel =scanner.next();
			if(searchTel.equalsIgnoreCase("x")) break;
			Friend searchFriend = friends.get(searchTel);
			if(searchFriend == null) {
				System.out.println("검색되지 않는 전화번호 입니다.");
			}else {
				System.out.println("검색한 정보는 " + searchFriend);
			}//if
		}//while
		scanner.close();
	}//main
}
// ArrayList 는 추가시 add
// HashMap 은 추가시 put 
// " "작성시 띄어쓰기를 넣은걸 없애는 함수는 replace(" ","") 자리를 바꿔 없애주는 함수
