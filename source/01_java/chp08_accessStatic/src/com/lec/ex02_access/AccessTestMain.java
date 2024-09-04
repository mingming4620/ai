package com.lec.ex02_access;

public class AccessTestMain {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest() ;
		//System.out.println(obj.privateMember);
		System.out.println(obj.defaultMember);
		System.out.println(obj.protectedMember);
		System.out.println(obj.publicMember);
		//obj.privateMethod();
		obj.defautlMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}

}
