package com.lec.ex2_protected.Quiz;

public class ChildTestMain {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.setI(1); child1.setJ(2);
		child1.sum();
		System.out.println("-------------");
		Child child2 = new Child(10, 20);
		child2.sum();
	}
}
