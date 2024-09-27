package Singleton2;

import Singleton1.Single;

public class TestMain {
	public static void main(String[] args) {
		FirstClass firstObj = new FirstClass();
		SecondClass secondobj = new SecondClass();
		SingletonClass singObj = SingletonClass.getInstance();
		System.out.println("main함수에서 싱글톤객체 i값은 " + singObj.getI());
	}
}