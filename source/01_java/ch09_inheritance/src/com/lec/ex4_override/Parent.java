package com.lec.ex4_override;

public class Parent {
	public Parent() { //overloanding = 함수 중복 정의
		System.out.println("매개변수 없는 Parent 생성자");
	}
	public Parent(int i) {
		System.out.println("매개 변수 있는 parent 생성자");
	}
	public void method1() {
		System.out.println("Parent의 method1");
	}
	public void method2() {
		System.out.println("Parent의 method2");
	}
}
