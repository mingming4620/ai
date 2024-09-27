package com.lec.ex;

public class Hello {
	public static void main(String[] args) {
		System.out.println("args 배열의 길이: " + args.length);
		System.out.print("Hello ");
		for(int i =0 ; i < args.length; i++) {
			System.out.printf("Hello, %s\n",args[i]);
		}
	}
}
