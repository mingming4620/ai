package com.lec.ex2_store;
//증권가에 매장3호점: 김치찌개-9,000  부대찌개-10,000  비빔밥-10,000 얼큰순대국-9,000  공기밥-1,000원
public class Store3 implements HeadQuarterStore{
	private String storeName;
	public Store3(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public void bude() {
		System.out.println("부재찌개 8,000원");
		}
	@Override
	public void sunde() {
		System.out.println("순대국 안 팔아");
		}
	@Override
	public void kimchi() {
		System.out.println("김치찌개 8,000원");
		}
	@Override
	public void bibim() {
		System.out.println("비빔밥 9,000원");
		}
	@Override
	public void gongi() {
		System.out.println("공기밥 1,000원");
		}
	
	public String toString() {
		return "a"+ storeName +"a";
}
}
