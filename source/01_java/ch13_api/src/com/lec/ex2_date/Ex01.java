package com.lec.ex2_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex01 {
	public static void main(String[] args) {
		Date nowDate = new Date(); //현 시점
		Calendar nowCal = Calendar.getInstance();
		GregorianCalendar nowGc = new GregorianCalendar();
		System.out.println(nowDate);
		System.out.println(nowCal);
		System.out.println(nowGc);
		// 2024년 09월 09일 14시 14분 30초
		// yyyy(년도 4자리) yy(년도 2자리) MM(월 2자리) dd(일 2자리) E(요일) 
		// a(오전/오후) HH(24시간 단위 2자리) hh(12시간 단위 2자리) mm(분 2자리) ss(초 2자리)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E) HH시 mm분 ss초");
		String dateStr = sdf.format(nowDate); // date형 많이씀
		// nowCal.getTime(): calendar 객체를 date형으로 return
		String calStr = sdf.format(nowCal.getTime());
		String gcStr = sdf.format(nowGc.getTime());
		System.out.println(dateStr);
		System.out.println(calStr);
		System.out.println(gcStr);
	}

}
