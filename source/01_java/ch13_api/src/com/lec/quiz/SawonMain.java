package com.lec.quiz;

public class SawonMain {
	public static void main(String[] args) {
		Sawon[] employee = {new Sawon("a01","홍길동", Sawon.COMPUTER),
				new Sawon("b01","신길동", Sawon.PLANNING),
				new Sawon("a02","박길동", Sawon.COMPUTER, 2024, 9, 2),
				new Sawon("a03","이길동", Sawon.COMPUTER, 2024, 9, 1)
		};
		for(Sawon emp : employee) {
			System.out.println(emp);
		}
	}
}
