package com.lec.ex8_store;import java.time.chrono.ThaiBuddhistEra;

public class StoreMain {
	public static void main(String[] args) {
		HeadQuarterStore[] stores = { 
				new HeadQuarterStore(" = = 본사 = = "),
				new Store1 (" = = 주택가 1호점 = = "),
				new Store2 (" = = 대학가 2호점 = = "),
				new Store3 (" = = 증권가 3호점 = = ")
		};
//		for(int idx =0 ; idx<stores.length ; idx++) { //일반for문
//			System.out.println(stores[idx].toString());
//			stores[idx].kimchi();
//			stores[idx].bude();
//			stores[idx].bibim();
//			stores[idx].sunde();
//			stores[idx].gongi();
//		}
		for (HeadQuarterStore store : stores) {
			System.out.println(store);
			store.kimchi();
			store.bude();
			store.bibim();
			store.sunde();
			store.gongi();
		}
		
//		HeadQuarterStore head = new HeadQuarterStor(" = = 본사 = = "));
//		Store1 st1 = new Store1 (" = = 주택가 1호점 = = ");
//		Store2 st2 = new Store2 (" = = 대학가 2호점 = = ");
//		Stoer3 st3 = new Store3 (" = = 증권가 3호점 = = ");
//		HeadQuarterStore[] stores = {hesa, st1 , st2, st3);
	}
}
