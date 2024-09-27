package com.lec.ex1_list;
// new Friend("홍길동" "010-9999-9999");
public class Friend {
	private String name;
	private String tel;
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", tel=" + tel + "]";
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
