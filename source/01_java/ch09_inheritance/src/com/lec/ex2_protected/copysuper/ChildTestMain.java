package com.lec.ex2_protected.copysuper;

public class ChildTestMain {
	public static void main(String[] args) {
		Child child1 = new Child(1,2);
		child1.setI(1); child1.setJ(0);
		child1.sum();
		System.out.println("===========");
		Child child2 = new Child(10,20);
		child2.sum();
	}
}
