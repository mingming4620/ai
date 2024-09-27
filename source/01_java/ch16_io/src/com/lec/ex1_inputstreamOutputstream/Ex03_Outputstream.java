package com.lec.ex1_inputstreamoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 1.파일열기(스트림객체 생성) 2. 쓰기 3. 파일닫기(스트림객체 close)
public class Ex03_Outputstream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			//1. 파일열기 
			os = new FileOutputStream("txtFile/outTest.txt", true);  // 있는 파일은 덮어쓰고 없는 파일은 생성 
			//byte[] bs = {}; 못함 따로 따로 'h' 'r' 					//true:append, 생략하거나 false : 덮어쓰기
			String msg = "Hello Wolrd\nHi, Big Data1\n";
			byte[] bs = msg.getBytes();
			//2. 데이터 쓰기
			os.write(bs); // stream
			System.out.println("파일 출력 성공 ");
			// 폴더가 없을때 예외발생.
		} catch (IOException e) {
			System.out.println("폴더가 없을 때 : "+ e.getMessage());
		} finally {
				try {
					if(os!=null) os.close();
				} catch (IOException e) {
				}
		}//try -catch - finally
	}//main
}
