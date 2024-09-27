package com.lec.ex1_car;

public class CarMain {

	public static void main(String[] args) {
		Car mycar = new Car();
//		mycar.color = "아마존그레이";
		mycar.setColor("아마존그레이");
//		mycar.cc = 2400;
		mycar.setCc(120);
		System.out.println(mycar.getColor() + "색 차 배기량" + mycar.getCc() + ",속도는"  + mycar.getSpeed());
		mycar.drive();
		mycar.park();
		mycar.race();
		System.out.println(mycar.getColor() + "색 차 배기량" + mycar.getCc() + ",속도는"  + mycar.getSpeed());
		Car yourcar = new Car();
//		yourcar.color = "검정";
		yourcar.setColor("검정");
		yourcar.drive();
		System.out.println(mycar.getColor() + "색 차 배기량" + mycar.getCc() + ",속도는"  + mycar.getSpeed());
		System.out.println(yourcar.getColor() + "색 차 배기량" + yourcar.getCc() + ",속도는"  + yourcar.getSpeed());
	}
	
}
