package com.lec.ex3_eceptions;
// 데이터 : 이름, 전화번호, 생년월일(Date) 

// Friend f = new Friend ("홍길동","010-9999-9999", new Date(98, 8, 10)) 달력은 0월부터 시작 지금 달에서 -1
// sysout(f) => [이름]홍길*, [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	// 데이트형
	private String name;
	private String tel;
	private Date birthday;

	public Friend(String name) {
		this.name = name;
	}

	public Friend(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public Friend(String name, String tel, Date birthday) {
		super();
		this.name = name;
		this.tel = tel;
		this.birthday = birthday;
	}

	@Override
	public String toString() { // [이름]홍길*, [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬
		String result = "";
		// 이름
		String nameOut = name.substring(0, name.length() - 1) + "*"; // substring(0, name.length) 이름글자수 -1
		result += " [이름] " + nameOut;
		// 전화
		if (tel != null) {
			String telOut = tel.substring(tel.lastIndexOf("-") + 1);
			result += " [전화] ***-****-" + telOut;
		}
		// 생일
		if (birthday != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("M월d일");
			String birthOut = sdf.format(birthday);
			result += " [생일] " + birthOut;

			// 오늘이 생일인지 아닌지
			String today = sdf.format(new Date()); // "9월 10일"
			if (today.equals(birthOut)) {
				result += " ♬♬♬ 생일축하 ♬♬♬ ";
			}
		}
		return result;
	}
}
// substring (0.0) : 문자열의 인덱스 길이 몇부터 몇앞까지 
// lastIndexOf : 뒤에 - 찾은후 그뒤의숫자와 글자를 출력해야되니 +1로 출력
