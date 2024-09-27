package com.lec.ex1;
//CONSTANT_NUM , CONSTANT_STRING , method1(), method2()
public class ClassEx implements InterfaceEx1, InterfaceEx2 {

	@Override
	public void method2() {
		System.out.println("실제 구현은 implements한 클래스에서 method2");
	}

	@Override
	public void method1() {
		System.out.println("실제 구현은 implements한 클래스에서 method1");
	}
	

}
