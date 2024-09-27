package com.lec.ex1_inputstreamoutputstream;

import java.io.*;
// 파일 input : 
// 1) 파일을 연다.(스트림객체생성) 2)데이터를 읽는다.(read메소드 사용) 3)파일을 닫는다.(close 메소드 사용 (스트림객체를 해제한다.)
public class Ex01_Inputstream {
	public static void main(String[] args) {
		InputStream is = null;
		// 1단계 파일열기
		try {
			is = new FileInputStream("txtFile/inTest.txt");
		// 2단계 읽는다 (파일 끝까지)
			while(true){
				int i = is.read(); // 1byte 씩 읽는다.
				if(i == -1) break; // 파일의 끝이면 break;
				System.out.print((char)i); //입력값 확인
//				System.out.print((char)i+"(" + i +")"); // 아스키코드 값 같이 출력
			}
			System.out.println("끝");
		} catch (FileNotFoundException e) {
			System.out.println("예외메세지 : 파일 못 찾음. " +e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// 3단계 파일 닫는다
		} finally {
			try {
				if(is!=null) is.close(); // is가 null 아닐때 파일 닫는다.
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
