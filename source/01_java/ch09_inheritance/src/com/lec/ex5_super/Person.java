package com.lec.ex5_super;
// super() : 부모클래스의 생성자 함수
// super.~ : 부모클래스의 
// new Person(), new Person("아빠곰", "뚱뚱해")
public class Person {
	private String name; 
	private String charater;
	public Person() {
		System.out.println("매개변수 없는 Person 생성자 함수");
	}
	public Person(String name, String charater) {
		System.out.println("매개변수 있는 Person 생성자 함수");
		this.name = name;
		this.charater = charater;
	}
	public void intro() {
		System.out.println("★"+ name + "은" + charater);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharater() {
		return charater;
	}
	public void setCharater(String charater) {
		this.charater = charater;
	}
	
}
