package com.lec.ex2;
//method1(추상) , method2(일반), method3(일반)
//추상 클레스는 객체 생성 불가. 변수 타입으로 가능
public abstract class SuperClass {
	public abstract void method1(); // 추상 메소드
	public void method2() {
		System.out.println("SuperClass의 method2");
	}
	public void method3() {
		System.out.println("SuperClass의 method3");
	}
}
