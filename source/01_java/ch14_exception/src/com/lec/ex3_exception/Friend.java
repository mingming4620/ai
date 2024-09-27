package com.lec.ex3_exception;
import java.text.SimpleDateFormat;
// 데이터 : 이름, 전화번호, 생년월일(Date) 
//new friend("홍길동", "010-9999-9999", new Date(98, ,8, 1))
// sysout(f) => [이름]홍길* [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬
import java.util.Date;
public class Friend {
	private String name;
	private String tel;
	private Date birthday;
	public Friend(String name) {
		this.name = name;
	}
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public Friend(String name, String tel, Date birthday) {
		this.name = name;
		this.tel = tel;
		this.birthday = birthday;
	}
	@Override
	public String toString() {//[이름]홍길* [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬
		String result = "";
		//이름
		String nameOut = name.substring(0, name.length()-1) + "*";
		result += "[이름]" + nameOut;
		//전화
		if(tel!=null) {
		String telOut = tel.substring(tel.lastIndexOf("-")+1);
		 result += " [전화]***-****-" + telOut;
		}
		 //생일
		if (birthday!=null) {
		 SimpleDateFormat sdf = new SimpleDateFormat("M월d일");
		 String birthOut = sdf.format(birthday);
		 result += " [생일]" + birthOut;
		 //오늘이 생일인지 아닌지
		 String today = sdf.format(new Date()); // "9월 10일"
		 if(today.equals(birthOut)) {
			 result += "♬ 생일축하 ♬";
			 
		 }
		 }
		return result;
	}
}
