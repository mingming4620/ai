package com.lec.ex2_readerWriter;

import java.io.*; // 컨트롤 쉬프트 o

public class Ex01_write {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("txtFile/msg.txt", true); // append 출력 스트림
			//char[] msg = {"안", "녕"};
			String msg = "내일부터는 오라클 입니다. \n DBMS는 개발자뿐 아니라, 데이터를 다룰 과학자에게도 필수1\n";
			writer.write(msg);
			msg = "두번째 write 입니다.\n";
			writer.write(msg);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(writer != null) writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
