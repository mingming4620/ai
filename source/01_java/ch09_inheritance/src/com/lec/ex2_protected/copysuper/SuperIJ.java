package com.lec.ex2_protected.copysuper;

public class SuperIJ {
	protected int i;
	protected int j;
	public SuperIJ () {
		System.out.println("매개변수 없는 SuperIJ 생성자함수");
	}
	public SuperIJ(int i, int j) {
		System.out.println("매개변수 있는 SuperIJ 생성자 함수, i와 j 초기화");
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}
