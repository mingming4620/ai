package com.lec.ex6_final;
// final 변수앞 : 변수 수정금지
// final method 앞 : override 금지
// final class 앞 : 상속금지
public final class Rabbit extends Animal {
	@Override
	public void running() {
		speed += 30;
		System.out.println("토끼가 마구 뛰어요. 현재 속도 : " + speed);
	}
}
