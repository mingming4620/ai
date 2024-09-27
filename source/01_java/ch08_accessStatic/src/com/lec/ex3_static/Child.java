package com.lec.ex3_static;
// new Child("첫째") ("둘쨰")("셋째")
// child1. takeMoney(3000);
public class Child {
	private String name;
	static Mom mom = new Mom(); // 공유하고 있는 데이터 defalut값 같은 패키지에선 pulic 다른패키지에선 private
	public Child(String name) {
		this.name = name;
	}
	public static void method() { // 공유하고 있는 메소드
		System.out.println("method");
	}
	public void takeMoney(int money) {
		if(mom.money >= money) {
			mom.money -= money;
			System.out.println(name + "가" + money + "원 가져가서 엄마 지갑엔 " + mom.money);
		}else {
			System.out.println(name + "가 돈 못 받음. 현재 엄마 지갑엔 " + mom.money);
		}
	}
}
