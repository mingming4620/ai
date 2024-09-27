package com.lec.ex3_Square;
// 속성, 생성자, 메소드, [setter&getter]
// Square s = new Square() : s side를 0초기화
// Square s = new Square(10) : s side를 10으로 초기화
public class Square {
	private int side;
	public Square() {
		System.out.println("매개변수 없는 생성자 함수 호출");
	}
	public Square(int side) {
		this.side = side;
		System.out.println("매개변수 있는 생성자 함수 호출");
	}
	public int area() {
		return side*side;
	}
	//setters & getters
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
}
