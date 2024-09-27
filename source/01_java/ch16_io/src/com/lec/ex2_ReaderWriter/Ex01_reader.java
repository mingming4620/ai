package com.lec.ex2_readerWriter;

import java.io.*;

public class Ex01_reader {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("txtFile/inTest.txt");// 1단계
			while(true) { // 2단계
				int i = reader.read(); // 2바이트 읽기
				if( i== -1) break;
				System.out.print((char)i + "/");
			}
		} catch (IOException e) {
			System.out.println("읽기 권한 오류 : "+e.getMessage());;
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (Exception e) {
				
			}
		}
		
	}

}
