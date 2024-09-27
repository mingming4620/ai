package com.lec.ex1_student;
//데이터 : name(String), kor(int), eng(int) mat(int) tot(int) avg(double)
//생성자 : new Student("정우성",90,90,90)
//메소드 : infoprint(), infoString()
public class Student {
	//데이터
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	//생성자
	public Student() {}
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = tot/3.;
//		avg = (double)tot/3;
	}
	//메소드
	public void infoprint() {
	// \t이름\t국어\t영어\t수학\t총점\t평균
	// \t정우성\t100\t100\t100\t300\t100.0
		System.out.printf("\t%s\t%3d\t%3d\t%3d\t%3d\t%5.1f", name,kor,eng,mat,tot,avg); // 1번
	}
	public String infoString() {
		return String.format("\t%s\t%3d\t%3d\t%3d\t%3d\t%5.1f", name,kor,eng,mat,tot,avg); // 2번
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
