package com.let.ex1_car;

public class CarMain {
	public static void main(String[] args) {
			Car myPorshe = new Car();
			//myPorshe.color="빨강";
			myPorshe.setColor("빨강");
			//myPorshe.cc = 2400;
			myPorshe.setCc(2400);
			System.out.println(myPorshe.getColor() + "색차량 배기량은 " +
								myPorshe.getCc() + ", 속도는 " + myPorshe.getSpeed());
		myPorshe.drive();
		myPorshe.park();
		myPorshe.race();
		System.out.println(myPorshe.getColor() + "색차량 배기량은 " +
							myPorshe.getCc() + ", 속도는 " + myPorshe.getSpeed());
		Car yourPorshe = new Car();
		//yourPorshe.color = "gray";
		yourPorshe.setColor("gray");
		yourPorshe.drive();
		System.out.println(myPorshe.getColor() + "색차량 배기량은 " +
					myPorshe.getCc() + ", 속도는 " + myPorshe.getSpeed());
		System.out.println(yourPorshe.getColor() + "색차량 배기량은 " +
					yourPorshe.getCc() + ", 속도는" + yourPorshe.getSpeed());
			
	}
}
