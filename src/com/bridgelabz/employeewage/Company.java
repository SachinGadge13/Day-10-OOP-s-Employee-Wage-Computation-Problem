package com.bridgelabz.employeewage;

import java.util.Arrays;

public class Company {
	
	//Constants
	public final String companyName;
	public final int empRatePerHr;
	public final int numberOfWorkingDays;
	public final int maxWorkingHrsPerMonth;
	public int totalEmpWage = 0;
	
	/*
	 * using array of integers which stores  values of 20
	 */
	public int[] dailyWage = new int[20];

	public Company(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrsPerMonth) {
		super();
		
		/*
		 * using this keyword which pointing to the class variables 
		 */
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxWorkingHrsPerMonth = maxWorkingHrsPerMonth;
	}

	@Override
	public String toString() {
		return "Company:" + companyName + " [totalEmpWage=" + totalEmpWage + "]\n" + "dailyWage="
				+ Arrays.toString(dailyWage);
	}

}