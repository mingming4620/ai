package com.lec.Quiz;

public class Customer {
	private String name;
	private String tel;
	private String addrass;
	public Customer(String name, String tel, String addrass) {
		this.name = name;
		this.tel = tel;
		this.addrass = addrass;
	}
	@Override
	public String toString() {
		return name + " " + tel + " " + addrass;
	}
}
