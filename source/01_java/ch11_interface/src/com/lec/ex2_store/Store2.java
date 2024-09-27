package com.lec.ex2_store;
//대학가에 매장2호점: 김치찌개-8,000  부대찌개-8,000  비빔밥-8,000 순대국-8,000  공기밥-무료
public class Store2 implements HeadQuarterStore{
	private String storeName;
	public Store2(String storeName) {
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