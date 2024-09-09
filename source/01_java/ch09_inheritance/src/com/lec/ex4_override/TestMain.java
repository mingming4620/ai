package com.lec.ex4_override;
public class TestMain {
	public static void main(String[] args) {
		Parent pObj1 = new Parent();
		Parent pObj2 = new Parent();
		System.out.println("pObj 1과 pObj2가 같은지 ? " + (pObj1.equals(pObj2)));
		pObj1.method1();
		pObj2.method2();
		System.out.println("-------------------------------");
		Child cObj1 = new Child();
		Child cObj2 = new Child();
		System.out.println("cObj1과 cObj2가 같은지 ? " + (cObj1.equals(cObj2)));
		cObj1.method1();
		cObj1.method2();
		System.out.println("-------------------------------");
		Parent obj = new Child(10);
		obj.method1();
		obj.method2();
		// ((child)obj).method3(); // 객체의 명시적인 형변환
		if(obj instanceof Child) { //obj가 child형 인스턴스 변수냐
			((Child)obj).method3();
		}else {
			System.out.println("형변환 불가");
		}
	}
}









