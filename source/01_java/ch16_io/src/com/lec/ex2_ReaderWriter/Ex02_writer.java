package com.lec.ex2_ReaderWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Ex02_writer {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("txtFile/inTest.txt", true);
			//char[] msg = {'안', '녕'};
			String msg = "내일부터 오라클입니다.\nDBMS는 개발자뿐 아니라 , 데이터를 다룰 과학자에게도 필수\n";
			writer.write(msg);
			msg = "두번째 writer입니다\n";
			writer.write(msg);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(writer!=null) writer.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
