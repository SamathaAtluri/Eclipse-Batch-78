package com.Inheritance;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Samatha Bank");
		System.out.println("1. Personal Loan");
		System.out.println("2. Gold Loan");
		System.out.println("3. Car Loan");
		System.out.println("4. Home Loan");

		System.out.println("Enter Your Choice:");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			PersonalLoan.main(args);
			break;
		
		case 2:
			GoldLoan.main(args);
			break;
		
		case 3:
			CarLoan.main(args);
			break;
			
		case 4:
			HomeLoan.main(args);
			break;
			
		default:
			System.out.println("Invalid Choice");
		
		
		}
	}

}
