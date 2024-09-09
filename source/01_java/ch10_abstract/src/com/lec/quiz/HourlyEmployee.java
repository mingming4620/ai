package com.lec.quiz;
//name, hoursWorked, moneyPerHour, computePay(),computeIncentive()
public class HourlyEmployee extends Employee{
	private int hourworked ;
	private int moneyPerHour;
	public HourlyEmployee(String name, int hourworked, int moneyperHour) {
		super(name);
		this.hourworked = hourworked;
		this.moneyPerHour = moneyPerHour;
		
	}	
	@Override
	public int computePay() {
		return hourworked*moneyPerHour;
	}
}

