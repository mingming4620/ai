package com.lec.ex1_inputstreamoutputstream;

import java.io.*;
public class Ex02_InputstreamByteArray {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/inTest.txt");
			// 10바이트씩 bs에 읽어오는 용도 (10바이트 배열 생성)
			byte[] bs = new byte[10]; 
			// 2단계 읽어오기
			while(true) {
				int readByteCount = is.read(bs);
				if(readByteCount == -1) break;
				for(int i=0 ; i<readByteCount ; i++) {
					System.out.print((char)bs[i]); // 아스키코드 출력을 형변환하기 char
				}
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			// 3단계 파일 닫는다
				try {
					if(is != null) is.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
		}

	}
}
