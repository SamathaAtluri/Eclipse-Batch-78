package com.Inheritance;

import java.util.Scanner;

public class PersonalLoan extends Loan {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Samatha Bank - Personal Loan");
		
		PersonalLoan pl = new PersonalLoan();
		
		int age = pl.getAge();
		double salary = pl.getSalary();
		int cibil = pl.getCibilScore();
		
		if(salary>=100000.00 && age>=23 && cibil>=300 && cibil<=900) {
			System.out.println("Congratulations You are Eligiible for Personal Loan");
			System.out.println("Your Rate of Intrest is:"+pl.getROI(cibil));
		}else {
			System.out.println("Focus on your Career !!");
			System.out.println("Sorry for the inconvenience !! Youe Loann got rejected !! ");
		}
		

	}

}
