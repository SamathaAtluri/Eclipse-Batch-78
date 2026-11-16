package com.Inheritance;

import java.util.Scanner;

public class Loan {

	Scanner sc = new Scanner(System.in);

	double getSalary() {
		System.out.println("Enter your Salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	int getAge() {
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		return age;
	}

	int getCibilScore() {
		System.out.println("Enter Cibil Score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI(int cibil) {
		double roi = 20.0;

		if (cibil > 900 || cibil < 300) {
			System.out.println("Cibil data is Invalid !!!");
		} else if (cibil >= 800 && cibil <= 900) {
			System.out.println("Strong credit profile, best loan terms - Excellent");
			roi = roi - 11.0;// 9%
		} else if (cibil >= 770 && cibil < 800) {
			System.out.println("High approval chances, competitive rates - Very Good");
			roi = roi - 9.0;// 11%
		} else if (cibil > 700 && cibil < 770) {
			System.out.println("Eligible for most loans with decent terms  - Good");
			roi = roi - 8.0;// 12%
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("May get loans but at higher interest - Average");
			roi = roi - 7.0;// 13%
		} else {
			System.out.println("High risk loan applications often rejected - Poor ");
		}

		return roi;

	}

	boolean isPhoneValid() {
		boolean isValid = false;
		System.out.println("Enter Phone Number");
		String phone = sc.next();
		isValid = phone.matches("[6-9]{1}[0-9]{9}");
		return isValid;
	}

	boolean isAadharValid() {
		boolean isValid = false;
		System.out.println("Enter AAdhar number;");
		String aadhar = sc.next();
		isValid = aadhar.matches("[2-9]{1}[0-9]{11}");
		return isValid;
	}

	boolean isPanValid() {
		boolean isValid = false;
		System.out.println("Enter PAN number;");
		String pan = sc.next();
		isValid = pan.matches("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-z]{1}");
		return isValid;
	}

}
