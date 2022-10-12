package com.bridgelabz.employeewage;

public class UC13 {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employees" );
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompanyDetailsForEmpWage("Bridgelabz", 10, 20, 16);
		employeeWage.addCompanyDetailsForEmpWage("Dell", 20, 20, 20);
		employeeWage.addCompanyDetailsForEmpWage("Assus", 10, 20, 10);
		employeeWage.companyEmpWage();
	}
}