package com.lec.ex6_final;

public class AnimalTestMain {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3,};
		Animal[] animals = {new Animal(), new Dog(), new Rabbit()};
		for(int idx=0 ; idx<animals.length ; idx++) {
			animals[idx].running();
			animals[idx].running();
			animals[idx].stop();
			System.out.println("------------------------------");
		}
	}
}
