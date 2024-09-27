package com.lec.ex2_rect;
// 클레스 : 속성(인스턴스변수 private), 생성자함수(속성데이터초기화), 메소드 (mathod), setter&getter , default
// Rect r1 = new Rect(); r1.setWidth(2); r2.setHeight(4);
// Rect r1 = new Rect(3);
// Rect r1 = new Rect(2, 4);
public class Rect {
	private int width;
	private int height;
	//생성자 함수가 없을 경우 , JVM이 자동생성
	public Rect() {} // default 생성자
	public Rect(int side) {
//		width = height = side;
		width = side;
		height = side;
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int area() {
		return width*height;
	}
	// setter & getter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
