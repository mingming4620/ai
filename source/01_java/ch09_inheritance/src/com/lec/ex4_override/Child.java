package com.lec.ex4_override;
// medhod1(), method2() 잡혀있음
public class Child extends Parent {
	public Child() {// 생성자 overloading 함수의 중복정의
		System.out.println("매개변수 없는 Child 생성자");	
	}
	public Child(int i) {
		System.out.println("매개변수 있는 Child 생성자");	
	}
	@Override
	public void method1() { // oberride = 함수의 재정의
		System.out.println("Child의 method1()");
	}
	public void method3() {
		System.out.println("Child의 method3()");
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
