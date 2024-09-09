package com.lec.ex2_store;
// 김치찌개-8,000 부대찌개-8,000(v) 비빔밥-8,000(v) 순대국-8,000 공기밥-무료(v)
public class Store2 implements HeadQuarterStore {
	private String storeName;
	public Store2(String storeName) {
		this.storeName = storeName;	
	}
	@Override
	public void kimchi() {
		System.out.println("김치찌개 8,000원");}
	@Override
	public void bude() {
		System.out.println("부재찌개 8,000원");}
	@Override
	public void bibim() {
		System.out.println("비빔밥 8,000원");}
	@Override
	public void sunde() {
		System.out.println("순대국 8,000원");}	
	@Override
	public void gongi() {
		System.out.println("공기밥 무료");}
	@Override
	public String toString() {
		return "★" + storeName + "★";
	}
}
