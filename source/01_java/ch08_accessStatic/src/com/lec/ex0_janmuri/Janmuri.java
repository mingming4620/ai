package com.lec.ex0_janmuri;
class PersonInfo{
	private String name;
	private String tel;
	public PersonInfo(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String info() {
		return name + ":" + tel;
	}
}
public class Janmuri {
	public static void main(String[] args) {
		PersonInfo p = new PersonInfo("홍길동", "010-9999-999");
		System.out.println(p.info());
	}
}
