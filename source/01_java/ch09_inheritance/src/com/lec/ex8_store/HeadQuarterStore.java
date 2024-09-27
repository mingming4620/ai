package com.lec.ex8_store;
//김치찌개-8,000  부대찌개-9,000  비빔밥-9,000 순대국-8,000  공기밥-1,000원
// new HeadQuarterStore("본사") new Store1("1호점")
public class HeadQuarterStore {
	private String storeName;
	public HeadQuarterStore(String storeName) {
		super();
		this.storeName = storeName;
	}
	public void kimchi() {
		System.out.println("김치찌개 : 8,000원");
	}
	public void bude() {
		System.out.println("부대찌개 : 9,000원");
	}
	public void bibim() {
		System.out.println("비빔밥 : 9,000원");
	}
	public void sunde() {
		System.out.println("순대국 : 8,000원");
	}
	public void gongi() {
		System.out.println("공기밥 : 1,000원");
	}
	public String getStoreName() {
		return storeName;
	}
	@Override
	public String toString() {
		return storeName;
	}


}
