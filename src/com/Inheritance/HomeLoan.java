package com.Inheritance;

public class HomeLoan extends Loan {

	public static void main(String[] args) {

		HomeLoan hl = new HomeLoan();

		System.out.println("Welcome to Samatha Bank - Car Loan");

		int age = hl.getAge();

		double salary = hl.getSalary();

		int cibil = hl.getCibilScore();

		if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congratulations !! Your are Eligible for Car Loan..");

			System.out.println("Your Rate of Intrest is:" + hl.getROI(cibil));

		} else {
			System.out.println("Sorry !! your are not Eligiblee for Car Loan...");
		}

	}

}
