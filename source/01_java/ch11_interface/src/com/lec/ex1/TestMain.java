package com.lec.ex1;

public class TestMain {
	public static void main(String[] args) {
		ClassEx ex = new ClassEx();
		ex.method1();
		ex.method2();
		// 객체의 다형성 
		InterfaceEx1 ex1 = new ClassEx(); 
		ex1.method1();
		// ex1.method2();
		InterfaceEx2 ex2 = new ClassEx();
		// ex2.method1();
		ex2.method2();
	}
}
