package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	static final int isPresent = 1;
	static final int isPartTime = 2;

	private void wagesTillMonth(int salaryPerHour, int totalWorkingDays, int maxWorkingHour, int fullDayWorkingHour) {
		int empCheck;
		int empHr = 0;
		int totalSalary = 0;
		int day = 0;
		while (day < totalWorkingDays && (empHr + fullDayWorkingHour) <= maxWorkingHour) {
			day++;
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			switch (empCheck) {
			case isPresent:
				empHr += fullDayWorkingHour;
				break;

			case isPartTime:
				empHr += (fullDayWorkingHour / 2);
				break;

			default:
				empHr += 0;
				break;
			}
			System.out.println("Working day : " + day + " (Present : " + empCheck + ")");
		}
		totalSalary = empHr * salaryPerHour;
		System.out.println("Monthly Employee Wage is : " + totalSalary + "\nTotal working hours are : " + empHr);
	}

	public static void main(String[] args) {
		EmployeeWage wage = new EmployeeWage();
		wage.wagesTillMonth(20, 20, 100, 8);
	}
}