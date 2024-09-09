package com.lec.ex1;
//CONSTANT_NUM, CONSTANT_STRING, method1(), method2()
public class ClassEx implements InterfaceEx1, InterfaceEx2 {

	@Override
	public void method2() {
		System.out.println(2);
		
	}

	@Override
	public void method1() {
		System.out.println(1);
		
	}

}
