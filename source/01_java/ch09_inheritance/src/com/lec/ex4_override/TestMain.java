package com.lec.ex4_override;

public class TestMain {
	public static void main(String[] args) {
		Parent pObj1= new Parent();
		Parent pObj2= new Parent();
		System.out.println("pObj1과 pObj2가 같은지 ? " + (pObj1.equals(pObj2)));
		pObj1.method1();
		pObj2.method2();
		Child cObj1 = new Child();
		Child cObj2 = new Child();
		System.out.println("cObj1과 cObj2가 같은지 ? " + (cObj1.equals(cObj2)));
		cObj1.method1();
		cObj1.method2();
		cObj1.method3();
		Parent obj = new Child();
		obj.method1();
		obj.method2();
		//((Child)obj).method3(); // 객체의 명시적인 형변환
		if(obj instanceof Child) {//odj가 Child형 인스턴스 변수냐? instanceof 뒤에있는 객체 타입인지 물어보는 함수
			((Child)obj).method3();
		}else {
			System.out.println("형변환 불가");
		}
	}
}
