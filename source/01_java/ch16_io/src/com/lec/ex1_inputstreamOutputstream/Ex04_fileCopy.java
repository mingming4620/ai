package com.lec.ex1_inputstreamoutputstream;

import java.io.*; // 컨트롤 + 쉬프트 + o
// bts_7.mp4 읽어서 같은 폴더에 bts_7_copy.mp4  (폴더를 다르게 하거나 파일을 다르게 해야됨 )	 7,460,545 byte
public class Ex04_FileCopy {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // 1970.1.1부터 시작시점까지의 밀리세컨
		InputStream  is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("D:/ai/lecNote/01_java/bts_7.mp4"); // \\역슬래시 2개를 /슬래시 1개로 가능
			os = new FileOutputStream("D:\\ai\\lecNote\\01_java\\bts_7_copy.mp4");
			int cnt = 0; //count
			while(true) { // read & write
				int i = is.read(); // 1byte씩 가져온다 
				if( i == -1) break; // 파일의 끝 -1
				os.write(i);
				cnt++;
				if(cnt % 300000 == 0) {
					System.out.println(cnt + "/7,460,545 번");
				}
			}
			System.out.println("파일 복사 완료" + cnt + "번");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if( is != null) is.close();
				if( os != null) os.close();
			} catch (IOException e) {
				
			} 
			
		}
		long end = System.currentTimeMillis(); // 1970.1.1부터 종료시점까지 밀리세컨
		System.out.println((end-start)/1000.0 + "초 걸림");
	}
}
