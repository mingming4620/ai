package com.lec.ex1_parentChild;

public class ChildClassTestMain {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		System.out.println(child.cStr);
		System.out.println(child.pStr);
		child.getMamiName();
		child.getPapaName();
	}
}
