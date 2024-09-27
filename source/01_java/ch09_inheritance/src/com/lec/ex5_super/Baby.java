package com.lec.ex5_super;
// super() : 부모클래스의 생성자 함수
// super.intro() : 부모클래스의 intro() 함수
// private(name, charater) public(intro(), getter&setter)
public class Baby extends Person {

	public Baby() {
		super(); // 부모클래스의 매개변수 없는 생성자 함수 호출. super() 생략할 경우 super()자동 실행
		System.out.println("매개변수 없는 Baby 생성자 호출");
	}
	public Baby(String name, String character) {
		super(name, character); // 부모클래스의 매개변수 있는 생성자 함수 호출 . super() 메소드 반드시 첫번째 줄에 호출
		System.out.println("매배견수 있는 Baby 생성자 호출");
	}
	@Override
	public void intro() {
		System.out.print("♨ 응애응애 화난 아기");
		super.intro(); // super.은 아무곳에나 있어도 가능
	}
}
