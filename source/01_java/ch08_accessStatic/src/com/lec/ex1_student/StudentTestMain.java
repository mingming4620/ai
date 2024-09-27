package com.lec.ex1_student;

public class StudentTestMain {
	private static void line() {
		for(int i=0 ; i<65 ; i++) {
			System.out.print('■');
		}
		System.out.println();//개행
	}
	private static void line(char ch) {
		System.out.print("\t");
		for (int i=0 ; i<50 ; i++) {
			System.out.print(ch);
		}
		System.out.println(); //개행
	}
	public static void main(String[] args) {
		
	Student[] students = {new Student("정우성",90,90,90),
						new Student("김하늘",90,90,91),
						new Student("황정민",80,80,80),
						new Student("강동원",80,80,81),
						new Student("마동석",99,99,99)};
	String[] titles = {"이름","국어","영어","수학","총점","평균"};
	int[] tot = new int[5]; // tot[0]:국어누적, tot[1]:영어누적, tot[2]:수학누적, tot[3]:총점누적, tot[4]:avg누적
	line();
	System.out.println("\t\t\t\t\t성적표");
	line('-');
	for(String title : titles ) {
		System.out.print("\t" + title);
	}
	System.out.println( ); //개행
	line('-');
	for(Student student : students) {
		System.out.println(student.infoString());
		tot[0] += student.getKor();
		tot[1] += student.getEng();
		tot[2] += student.getMat();
		tot[3] += student.getTot();
		//tot[4] += tot[4] Student.gettot();
		tot[4] += student.getAvg();
	}
	line('-');
	System.out.print("\t총점");
	for(int t : tot){
		System.out.print("\t" + t);
	}
	System.out.println( ); // 개행
	line();
	}//main
	
}