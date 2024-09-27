package com.lec.ex7_customer;
// Customer와 Staff의 공통점을 super 단에
public class Person {
	private String name;
	private String tel;
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String infoString() {
		return "[이름]" + name +"[전화]" + tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
