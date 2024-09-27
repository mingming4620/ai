package com.lec.ex1_list;

import java.util.ArrayList;

public class Ex02_FriendArrayList {
	public static void main(String[] args) {
//		Friend[] fs = new Friend[2];
//		fs[0] = new Friend("홍길동", "010-9999-9999");
//		fs[1] = new Friend("신길동", "010-8888-8888");
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("홍길동", "010-9999-9999")); // 0번인덱스
		friends.add(new Friend("신길동", "010-8888-8888")); // 1번인덱스
		friends.add(new Friend("박길순", "010-7777-7777")); // 2번인덱스
		for(int i=0 ; i<friends.size() ; i++) {
			System.out.println(friends.get(i));
		}
		for(Friend friend : friends) {
			System.out.println(friend);
		}//for
		for(Friend friend : friends) {
			System.out.println(friend.getName() +"\t"+ friend.getTel());
		}//for
		friends.clear(); // friends 모든 인덱스 데이터 제거
		if(friends.isEmpty()) {
			System.out.println("friend 데이터가 없습니다");
		}else {
			for(int idx=0 ; idx<friends.size() ; idx++) {
				System.out.println(friends.get(idx).getName() + "\t" + friends.get(idx).getTel());
			}//for
		}//if
	}//main
}
