package com.lec.ex7_customer;
// new staff("홍길동",010-9999-9999,"개발"0
public class Staff extends Person{
	private String department; //부서

	public Staff(String name, String tel, String department) {
		super(name, tel);
		this.department = department;
	}
	@Override
	public String infoString() {
		return super.infoString() + "[부서]" + department;
	}

}
