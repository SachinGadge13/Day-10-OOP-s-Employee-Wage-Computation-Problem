package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int randomNum = random.nextInt(2); // 0-1

		if (randomNum == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}