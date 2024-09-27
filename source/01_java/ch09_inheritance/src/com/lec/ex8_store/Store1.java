package com.lec.ex8_store;
//김치찌개-8,000  부대찌개-8,000!  비빔밥-9,000 순대국-안팔아! 공기밥-1,000원 = 부대찌개 순대국 오버라이드
public class Store1 extends HeadQuarterStore {

	public Store1(String storeName) {
		super(storeName);
	}
	@Override
	public void bude() {
		System.out.println("부대찌개 : 8,000원");
	}
	@Override
	public void sunde() {
		System.out.println("순대국은 안 팝니다");
	}
	@Override
	public String toString() {
		return "a" + getStoreName() + "a";
	}
}
