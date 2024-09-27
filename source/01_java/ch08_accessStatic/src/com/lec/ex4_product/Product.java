package com.lec.ex4_product;
// new Product("S22") 101 102 103 104  
public class Product {
	private String modelNo; // 모델명
	private int serialNo; // 객체 고유의 번호 시리얼넘버
	static int count= 100; // static 변수 초기화
	//생성자함수
	public Product(String modelNo) {
		this.modelNo = modelNo;
		serialNo = ++count;
	}//메소드
	public void infoprint() {
		System.out.println("모델명 : " + modelNo + "시리얼번호 : " + serialNo);
	}
}
