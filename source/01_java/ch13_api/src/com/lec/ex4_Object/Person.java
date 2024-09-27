package com.lec.ex4_Object;
// Person p1 = new Person(9812121515151L)
// Person p2 = new Person(9812121515151L)
// p1.equals(p2) => true
// sysout(p1) => 주민번호는 9812121515151 입니다.
public class Person {
	private long juminNo; //9812121515151L

	public Person(long juminbo) {
		this.juminNo = juminbo;
	}
	@Override
	public String toString() {
		return "주민번호는" + juminNo;
	}
	@Override
	public boolean equals(Object obj) {
		//p1.equals(p2) p1.juminNo와 p2의 juminNo비교결과 return
		//p1은 this, p2는 obj => juminNo와 obj.juminNo 비교
		if(obj!=null && obj instanceof Person) {
			Person other = (Person)obj;
			boolean juminNoChk = juminNo == other.juminNo;
			return juminNoChk;
		}
		return false;
	}

}
