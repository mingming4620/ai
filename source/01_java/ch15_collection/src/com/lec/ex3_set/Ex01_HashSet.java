package com.lec.ex3_set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex01_HashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("str0");
		set.add("str1");
		set.add("str2");
		System.out.println(set);
		System.out.println("set의 데이터 개수 : " + set.size());
		set.add("str2");set.add("str2"); // 중복불가
		System.out.println("중복된 데이터를 add한 후 set의 데이터 개수 : " + set.size()); 
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}	
}
