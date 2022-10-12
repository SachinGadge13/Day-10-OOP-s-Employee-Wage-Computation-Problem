package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage {
	ArrayList<Integer> Wage = new ArrayList<Integer>(); // Arraylist to store Integer value
	ArrayList<String> Wages = new ArrayList<String>(); // Arreylist to dtore String value

	void check() {
		// variable
		int totalsalary = 0;
		int maxRateInMonth = 100;
		int maxHoursInMonth = 100;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;
		int finalsalary = 0;

		System.out.println("Enter your company name ");
		Scanner p2 = new Scanner(System.in);
		String x = p2.nextLine();
		System.out.println(x); // taking user input company name
		Wages.add(x);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee rate Per hour of your Company :");
		int empRatePerHr1 = scanner.nextInt();

		System.out.println("Enter the Number of working days of your Company:");
		int numOfWorkingDays1 = scanner.nextInt();

		System.out.println("Enter the Number of working hours of your Company:");
		int numOfWorkingHrs1 = scanner.nextInt();

		while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays1
				&& numOfWorkingHrs1 <= maxHoursInMonth) {
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) {
			case 2:
				// System.out.println("Employee is FullTime");
				empHrs = 8;
				break;
			case 1:
				// System.out.println("Employee is PartTime");
				empHrs = 4;
				break;
			case 0:
				// System.out.println("Employee is Absent");
				empHrs = 0;
				break;
			}

			totalEmpHr = totalEmpHr + empHrs;
			// System.out.println(totalEmpHr);

		}
		totalsalary = totalEmpHr * empRatePerHr1;
		finalsalary += totalsalary;

		Wage.add(finalsalary);
		System.out.println("Total Wages For Each Company Are : " + Wages);
		System.out.println(Wage);

	}



	public static void main(String[] args) {

		System.out.println("How many company data you want to Enter ");
		// creating object for to call method
		EmployeeWage company = new EmployeeWage();

		Scanner p1 = new Scanner(System.in);
		p1.toString();
		int noOfCompanys = p1.nextInt(); // taking for how many company you want to store data

		for (int i = 1; i <= noOfCompanys; i++) {

			company.check(); // calling method in object

		}
	}

}