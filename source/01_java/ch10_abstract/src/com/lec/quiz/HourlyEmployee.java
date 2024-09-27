package com.lec.Quiz;
//name, hoursWorked, moneyPerHour, computepay(asstract), computeIncenitive(final)
public class HourlyEmployee extends Employee {
	private int hourlyWorked;
	private int moneyPerHour;
	
	public HourlyEmployee(String name, int hourlyWorked, int moneyPerHour) {
		super(name);
		this.hourlyWorked = hourlyWorked;
		this.moneyPerHour = moneyPerHour;
	}
	@Override
	public int computePay() {
		return hourlyWorked * moneyPerHour;
	}
	
}
