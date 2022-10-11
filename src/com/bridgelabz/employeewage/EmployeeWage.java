package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int workingDayPerMonth = 20;
		int monthlySalary = 0;

		int workingHourPerMonth = 0;
		int days = 1;
		Random random = new Random();
		int randomNum = random.nextInt(3);

		while (days != 20 && workingHourPerMonth != 100) {

			switch (randomNum) {
			case 0:
				System.out.println("Employee is Absent");
				break;

			case 1:
				System.out.println("Employee is Present");
				salary = wagePerHour * fullDayHours;
				workingHourPerMonth = workingHourPerMonth + fullDayHours;
				break;

			case 2:
				salary = wagePerHour * halfDayHours;
				workingHourPerMonth = workingHourPerMonth + halfDayHours;
				break;
			}

			monthlySalary = monthlySalary + salary;
			System.out.println("Day " + days + " : " + salary);
			days++;

		}
		System.out.println("Employee Monthly Salary is : " + monthlySalary);
	}

}