package com.lec.ex4_Object;

public class Ex02_cardMain {
	public static void main(String[] args) {
		 Card c1 = new Card("◆", 7);
		 Card c2 = new Card("◆", 7);
		 System.out.println(c1.equals(c2)? "c1과 c2는 같은카드" : "c1과 c2는 다른카드");
		 System.out.println(c1==c2 ? "c1과 c2는 같은 주소" : "c1과 c2는 다른 주소");
		 System.out.println(c1);
		 System.out.println(c2);
		 
	}

}
