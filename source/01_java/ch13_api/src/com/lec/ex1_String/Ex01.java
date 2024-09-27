package com.lec.ex1_String;
// 문자열변수에 문자열을 할당할 때, 이미 존재하는 문자열이 있으면 공유함.
// 새롭게 문자열을 할당하면 기존 문자열 객체는 반환되고 새로 문자열 객체가 생성.
public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		String str2 = "Java"; //new를 사용하지 않을시 같은 문자가 있으면 그 주소를 가져와서 사용
		String str1 = "Java";
		String str3 = new String ("Java"); // String은 new를 사용하지않음 
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 주소를 참조");
		}else {
			System.out.println("str1과 str2는 다른 주소를 참조");
		}
		System.out.println(str1 == str3 ? "str1과 str3는 같은 주소를 참조" : "str1과 str3는 다른 주소를 참조");
		System.out.println(str1.equals(str3)? "str1과 str3는 같은 문자열" : "str1과 str3는 다른 다른 문자열"); // equals는 문자열이 같은지 비교
		str2 = "Pypi"; // str2 문자열 변경시 새로운 객체 생성
		str1 = "j"; // str1 문자열 변경시 있던 객체를 버리고 새로운 객체를 생성
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 주소를 참조");
		}else {
			System.out.println("str1과 str2는 다른 주소를 참조");
		}
	}	
}
