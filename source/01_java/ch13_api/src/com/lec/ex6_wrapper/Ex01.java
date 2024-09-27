package com.lec.ex6_wrapper;

import java.security.Permissions;

import com.lec.ex4_Object.Person;

// Wrapper 클래스 
public class Ex01 {
	public static void main(String[] args) {
		String name = "홍길동";
		String otherName= "홍길동";
		Person p = new Person(9812121594561L); 
		System.out.println(name.equals(10));
		//System.out.println(name.equals(new Integer(10))); // 내부적으로 기초데이터를 실행시키기 위해 이렇게 만들어냄
		System.out.println(name.equals(10.9));
		//System.out.println(name.equals(new Double(10.9))); // 내부적으로 기초데이터를 실행시키기 위해 이렇게 만들어냄
	}
}
