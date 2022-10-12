package com.bridgelabz.employeewage;

public class UC14 {
	public static void main(String args[]) {
		// welcome message
		;
		System.out.println("Calculating wages for employees");
		System.out.println("Equires for daily wages");
		
		EmployeeWage empWageBuilder = new EmployeeWage();
		
		empWageBuilder.addCompanyDetailsForEmpWage("Bridgelabz", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("Asus", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("Dell", 10, 20, 10);
		
		empWageBuilder.companyEmpWage();  //enquirey
		empWageBuilder.printEmpWageForCompany();
	}
}