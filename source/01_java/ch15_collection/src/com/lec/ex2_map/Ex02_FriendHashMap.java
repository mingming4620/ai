package com.lec.ex2_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.lec.ex1_list.Friend;

public class Ex02_FriendHashMap {
	 public static void main(String[] args) {
		 Friend[] farr = new Friend[5];
		ArrayList<Friend> fs = new ArrayList<Friend>();
		 HashMap<String, Friend> friends = new HashMap<String, Friend>();
		 Friend newFriend = new Friend("김길동","010-8888-9999");
		 friends.put(newFriend.getTel(), newFriend);
		 friends.put("010-9999-9999", new Friend("홍길동", "010-9999-9999"));
		 friends.put("010-7777-7777", new Friend("신길동", "010-7777-7777"));
		 Iterator<String> iterator = friends.keySet().iterator(); // 반복자
		 while(iterator.hasNext()) {
			 String key = iterator.next();
			 System.out.println(friends.get(key) .getName()+"\t" + friends.get(key).getTel());
		 }
		 Iterator<String> iterator1 = friends.keySet().iterator(); // 반복자
		 while(iterator.hasNext()) {
			 String key = iterator.next();
			 System.out.println(friends.get(key));
	}
 }	 
}
