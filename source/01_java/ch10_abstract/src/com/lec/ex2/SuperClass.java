package com.lec.ex2;
// method1(추상), method2, method3(일반)
// 추상클래스는 객체 생성 불가, 변수 타입으로 가능
public abstract class SuperClass {
	public abstract void method1(); // 추상메소드
	public void method2() {
		System.out.println("SuperClass의 method2");
	}
	public void method3() {
		System.out.println("SuperClass의 method2");
	}
	
	}
