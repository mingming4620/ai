package com.lec.ex3_static;
// Child Child1 = new Child ("첫째");
// Child1.takeMoney(100);
public class Child {
	private String name;
	static Mom mom = new Mom();
	public Child(String name) {
		this.name = name;
	}
	public static void method() {
		System.out.println("Method");
}
	public void takeMoney(int money) {
		if(mom.money >= money) { 
			mom.money -= money;  //mom.money = mom.money - money;
			System.out.println(name + "가 " + money + "원 가져가서 엄마 지갑엔 " + mom.money);
		}else {
			System.out.println(name + " 가 돈 못받음, 현재 엄마 지갑엔" + mom.money);
		}
	}
}
