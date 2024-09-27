package com.let.ex1_car;
// 클래스 : 속성(데이터=인스턴스변수)과 메소드
// Car myCar = new Car();
// myCar.method명()
public class Car {
	private String color; 
	private int    cc; // 배기량 1500 2000
	private int    speed;
	public void park() {
		speed = 0;
		System.out.println(color + "색 주차함. 지금 속도 : " + speed);
	}
	public void drive() {
		speed = 60;
		System.out.println(color + "색 차 드라이브 함. 지금 속도 : " + speed);
	}
	public void race() {
		speed = 120;
		System.out.println(color + "색 차 레이싱 중. 지금 속도 : " + speed);		
	}
	// color (setter&getter)
	public void setColor(String color) {
		// this. : 내 객체의
		// 객체의 인스턴스변수와 매개변수(지역변수)의 우선순위는 지역변수 높음
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	// cc (setter&getter)
	public void setCc(int cc) {
		this .cc = cc;
	}
	public int getCc() {
		return cc;
	}
	
	// speed (getter)
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	}