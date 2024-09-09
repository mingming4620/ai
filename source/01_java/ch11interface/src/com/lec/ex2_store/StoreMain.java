package com.lec.ex2_store;
public class StoreMain {
	public static void main(String[] args) {
		HeadQuarterStore[] stores = { 
//				new HeadQuarterStore("= = 본사 = ="),
				new Store1("= = 주택가 1호점 = ="),
				new Store2("= = 대학가 2호점 = ="),
				new Store3("= = 증권가 3호점 = =")
		};
		for(int idx=0 ; idx<stores.length ; idx++) {
			System.out.println(stores[idx]);
			stores[idx].kimchi();
			stores[idx].bude();
			stores[idx].bibim();
			stores[idx].sunde();
			stores[idx].gongi();
		} // 일반for
		// 위의 일반for문을 확장 for문으로 수정해 보세요
		for(HeadQuarterStore store : stores) {
			System.out.println(store);
			store.kimchi();
			store.bude();
			store.bibim();
			store.sunde();
			store.gongi();
		}// 확장 for
//		HeadQuarterStore head = new HeadQuarterStore("= = 본사 = =");
//		Store1 st1 = new Store1("= = 주택가 1호점 = =");
//		Store2 st2 = new Store2("= = 대학가 2호점 = =");
//		Store3 st3 = new Store3("= = 증권가 3호점 = =");
//		HeadQuarterStore[] stores = {head, st1, st2, st3};
	}
}
