package com.bridgelabz.employeewage;

public class Company {
	public final String companyName;
	public final int empRatePerHr;
	public final int numberOfWorkingDays;
	public final int maxWorkingHrsPerMonth;

	public Company(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrsPerMonth) {
		super();
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxWorkingHrsPerMonth = maxWorkingHrsPerMonth;
	}

}