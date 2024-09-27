package com.lec.ex2_access;

public class AccessTest {
	private int privateMember; //같은 클래스 내에서만 사용 가능
			int defaultMember; // 디폴트 접근 제한 : 같은 패키지에서만 사용 가능
	protected int protectedMember; // 같은 패키지나 상속받은 클래스에서만 사용 가능
	public int publicMember; // 프로젝트 아무데서나 사용 가능
	private void privateMethod() { // 외부에선 쓸수없지만 내부에선 사용 가능
		System.out.println("private 메소드");
	}
	void defaultMethod() {
		System.out.println("default 메소드");
	}
	protected void protectedMethod() {
		System.out.println("protected 메소드");
	}
	public void publicMethod() {
		System.out.println("public 메소드");
	}
}
