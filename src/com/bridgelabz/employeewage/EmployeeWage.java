package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	int isPartTime = 1;
	int isFullTime = 2;

	int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth) {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 0:
				empHrs = 8;
				break;
			case 1:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Employee Wage for " + company + " is : " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		EmployeeWage Result = new EmployeeWage();
		System.out.println("Welcome to the Employee Wage Computation Calculation");

		Result.computeEmpWage("Flipkart", 20, 20, 100); // static int
		Result.computeEmpWage("Google", 25, 22, 100);
		Result.computeEmpWage("Microsoft", 25, 18, 100);// --empRatePerHr--numOfWorkingDays--maxHrsInMonth

	}
}