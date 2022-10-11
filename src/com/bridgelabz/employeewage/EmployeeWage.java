package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(3); // 0-1-2

		switch (randomNum) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is present");
			salary = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee worked for half day");
			salary = wagePerHour * halfDayHours;
			break;
		}
		System.out.println("Employee salary is : " + salary);
	}

}