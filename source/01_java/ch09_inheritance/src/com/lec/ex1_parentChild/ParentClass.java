package com.lec.ex1_parentChild;
// pStr, getPapaName(), getMamiName()
public class ParentClass {
	//생성자
	String pStr = "부모클래스";
	public ParentClass() {
		System.out.println("부모클래스(parent 클래스=super클래스) 생성자");
	}
	//메소드
	public void getPapaName() {
		System.out.println("아빠 이름 : 홍길동");
	}
	public void getMamiName() {
		System.out.println("엄마 이름 : 박길순");
	}

}
