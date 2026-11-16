package com.Inheritance;

public class CarLoan extends Loan {

	public static void main(String[] args) {
		CarLoan cl = new CarLoan();

		System.out.println("Welcome to Samatha Bank - Car Loan");

		int age = cl.getAge();

		double salary = cl.getSalary();

		int cibil = cl.getCibilScore();

		if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congratulations !! Your are Eligible for Car Loan..");

			System.out.println("Your Rate of Intrest is:" + cl.getROI(cibil));

		} else {
			System.out.println("Sorry !! your are not Eligiblee for Car Loan...");
		}

	}

}
