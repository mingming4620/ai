package com.lec.ex5_person;

public class PersonInfoTestMain {
	public static void main(String[] args) {
		PersonInfo p1 = new PersonInfo("홍길동", 33, 'm');
		PersonInfo p2 = new PersonInfo("홍길순", 32, 'f', "2001-12-01");
		PersonInfo[] person = {p1, p2};
		for(int idx=0 ; idx <person.length ; idx++) { // 일반 for문
//			person[idx].print();
			System.out.println(person[idx].infoString());
		}
		for(PersonInfo p : person) { // 확장for문 많이쓴다
			System.out.println(p.infoString());
		}
	}
}
