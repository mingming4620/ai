package com.lec.codition;
public class Ex03_switch {
	public static void main(String[] args) {
		int num=3;
		//switch(정수형이나 문자형이나 문자열만 가능)
		switch(num) {
		case 1:
				System.out.println("주사위 1"); break;
		case 2:
				System.out.println("주사위 2"); break;
		case 3:
				System.out.println("주사위 3"); break;
		case 4:
				System.out.println("주사위 4"); break;
		case 5:
				System.out.println("주사위 5"); break;
		default :
				System.out.println("주사위 6");
		}
//		if(number==1) {
//			System.out.println("주사위 1");
//		}else if(number==2) {
//			System.out.println("주사위 2");
//		}else if(number==3) {
//			System.out.println("주사위 3");
//		}else if(number==4) {
//			System.out.println("주사위 4");
//		}else if(number==5) {
//			System.out.println("주사위 5");
//		}else {
//			System.out.println("주사위 6");
//		}
	}
}
