package com.lec.ex6_final;
// speed, running() stop(final)
// final변수 , final 메소드, final 클래스 = 수정금지 클래스는 상속금지 
public class Dog extends Animal {
	@Override
	public void running() {
		speed += 10;
		System.out.println("강아지가 뛰면서 꼬리를 흔들어요. 현재 속도 : " + speed);
		
	}
}
