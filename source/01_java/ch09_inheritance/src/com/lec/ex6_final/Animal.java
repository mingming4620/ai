package com.lec.ex6_final;

public class Animal {
	protected int speed;
	public void running() {
		speed += 5;
		System.out.println("동물이 뛰고 있어요. 현제속도 :" + speed);
	}
	public final void stop() { //final을 넣으면 override 금지 메소드
		speed = 0;
		System.out.println("멈춤");
	}

}
