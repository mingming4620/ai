package com.lec.ex2_throws;

public class ThrowsEx {
	public ThrowsEx() throws Exception{
		actionB();
	}
	private void actionB() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionB 전반부");
			actionA();
		System.out.println("actionB 후반부");
	}
	private void actionA() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionA 전반부");
		int[] arr = {0, 1, 3};
		System.out.println(arr[3]);
		System.out.println("actionA 후반부");
		
	}
}

//e.printStackTrace(); 예외메세지를 더 자세하게