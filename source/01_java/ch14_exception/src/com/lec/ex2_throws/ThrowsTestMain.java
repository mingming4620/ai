package com.lec.ex2_throws;

public class ThrowsTestMain {
	public static void main(String[] args) {
		try {
			new ThrowsEx();
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace(); 예외메세지를 더 자세하게 설명
		}
		
	}
}

// main에서 던지게 될때는 예외가 안될확율이 있을때 던지기
// main에서 예외가 난걸 던지게 되면 JVM에서 오류를 다시 출력함 돌아와서 다시 try catch