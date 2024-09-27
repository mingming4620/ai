package com.lec.Quiz;
//name, annualSalary, computepay(abstract), computeIncenitive(final)
public class SalaryEmployee extends Employee {
	private int annualSalary;
	
	public SalaryEmployee(String name, int annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
	}
	public SalaryEmployee(String name) {
		super(name);
	}
	@Override
	public int computePay() {
		return annualSalary / 14;
	}

}
