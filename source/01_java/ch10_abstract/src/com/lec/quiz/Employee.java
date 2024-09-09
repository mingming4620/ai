package com.lec.quiz;
// name, int computePay(추상메소드-월급을 return하는 메소드), 
//int computeIncentive(월급이 300이상인 사람만 월급의 5%를 incentive)
public abstract class Employee {
		private final double RATE = 0.05;
		private String name;
		public Employee(String name) {
			this.name = name ;
		}
		public abstract int computePay(); // 추상메소드(반드시 오버라이드)
		public final int computeIncentive() {// final메소드(오버라이드 금지)
		 int pay = computePay();
		 if(pay >= 3000000) {
			 return (int)(pay*RATE);
		 }
		return 0;
		}
		public String getName() {return name;}
}