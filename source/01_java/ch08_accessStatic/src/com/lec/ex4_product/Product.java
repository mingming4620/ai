package com.lec.ex4_product;
// new product("S22") 101 102 103
public class Product {
	private String modelNo; // 모델명
	private int serialNo; // 객체 고유 번호
	static int count = 100; // 
	public Product(String modelNo) {
		this.modelNo = modelNo;
		serialNo = ++count;
	}
	public void infoPrint() {
		System.out.println("모델명 : " + modelNo + ", 시리얼번호 :" + serialNo);
	}
}
