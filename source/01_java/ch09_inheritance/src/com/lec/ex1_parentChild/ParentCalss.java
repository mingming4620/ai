package com.lec.ex1_parentChild;
// pStr, getPapaName(), getMamiName()
public class ParentCalss {
	String pStr = "부모 클래스";
	public ParentCalss() {
		System.out.println("부모 클래스(parent 클래스=super클래스)생성자");
		}
	public void getPapaName () {
		System.out.println("아빠이름 : 홍길동");
	}
	public void getMamiName() {
		System.out.println("엄마이름 : 박길순");
	}
}