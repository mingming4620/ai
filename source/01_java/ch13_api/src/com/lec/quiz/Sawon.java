package com.lec.quiz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

// Sawom s= new Sawon("24A001","홍길동",Sawon.COMPUTER, 2024, 9, 9)
// new Sawon("24A001","홍길동",Sawon.COMPUTER)
public class Sawon {
	//상수 바꾸지 정해진대로만 등록할수있게 막음
	public static final String COMPUTER = "전산실";
	public static final String PLANNING = "기획팀";
	public static final String DESIGN = "설계팀";
	private String no; // 사번
	private String name; // 이름
	private String dept; // 부서명
	private Date hiredate; // 입사일
	
	public Sawon(String no, String name, String dept) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		hiredate = new Date();
	}
	public Sawon(String no, String name, String dept, int y, int m, int d) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		hiredate = new Date( y - 1900, m -1, d);
		hiredate = new Date(new GregorianCalendar(y, m-1, d).getTimeInMillis()); //특정한 날 작성할때 사용
		
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일(E)");
		String datesdf = sdf.format(hiredate);
		return "[사번]" + no + ", [이름]" + name + ", [부서]" + dept + ", [입사일]" + datesdf;
	}
	
	

}
