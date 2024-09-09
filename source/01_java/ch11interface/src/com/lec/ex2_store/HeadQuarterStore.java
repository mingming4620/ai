package com.lec.ex2_store;
// HeadQuarter를 상속받은 측에서 반드시 override 하도록
// 추상클래스 : 추상메소드가 1개 이상
public interface HeadQuarterStore { 
	// 추상메소드 : 메소드 선언만 있고,구현은 없는 메소드 (구현은 상속받은 측에서)
	public abstract void kimchi() ;	
	public abstract void bude() ;	
	public abstract void bibim() ;	
	public abstract void sunde() ;	
	public abstract void gongi() ;
	}

