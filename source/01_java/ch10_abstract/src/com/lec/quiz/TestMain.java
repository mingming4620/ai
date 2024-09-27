package com.lec.Quiz;

public class TestMain {
	public static void main(String[] args) {
		Employee[] sawon = {
				new SalaryEmployee("홍길동", 48000000),
				new SalaryEmployee("강동원", 70000000),
				new SalaryEmployee("김고은", 76000000),
				new HourlyEmployee("홍길구", 100,9700),
				new HourlyEmployee("김길자", 160,10000)
				};
		for(Employee temp : sawon) {
			System.out.println("------------------------------------");
			System.out.println("이 름 :" + temp.getName());
			System.out.println("월 급 :"+ temp.computePay());
			int incentive = temp.computeInsentive();
			if(incentive > 0) {
				System.out.println("상 여 :" + incentive);
			}
		}
	}
}