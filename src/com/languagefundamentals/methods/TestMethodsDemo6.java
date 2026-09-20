package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** MAXIMUM OF TWO NUMBERS ********");
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		int max = maximum(a, b);
		System.out.println("Maximum: " + max);


		System.out.println("******** MINIMUM OF TWO NUMBERS ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		int min = minimum(a, b);
		System.out.println("Minimum: " + min);


		System.out.println("******** MAXIMUM OF THREE NUMBERS ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		System.out.println("Enter c value:");
		int c = sc.nextInt();
		int max3 = maximumOfThree(a, b, c);
		System.out.println("Maximum: " + max3);


		System.out.println("******** MINIMUM OF THREE NUMBERS ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		System.out.println("Enter c value:");
		c = sc.nextInt();
		int min3 = minimumOfThree(a, b, c);
		System.out.println("Minimum: " + min3);


		System.out.println("******** ABSOLUTE VALUE ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		int abs = absoluteValue(a);
		System.out.println("Absolute Value: " + abs);


		System.out.println("******** POWER ********");
		System.out.println("Enter base:");
		double powerBase = sc.nextDouble();
		System.out.println("Enter exponent:");
		double exponent = sc.nextDouble();
		double powerResult = power(powerBase, exponent);
		System.out.println("Power: " + powerResult);


		System.out.println("******** SQUARE ROOT ********");
		System.out.println("Enter number:");
		double number = sc.nextDouble();
		double sqrt = squareRoot(number);
		System.out.println("Square Root: " + sqrt);


		System.out.println("******** CUBE ROOT ********");
		System.out.println("Enter number:");
		number = sc.nextDouble();
		double cbrt = cubeRoot(number);
		System.out.println("Cube Root: " + cbrt);


		System.out.println("******** EVEN NUMBER ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		boolean even = isEven(a);
		System.out.println("Is Even: " + even);


		System.out.println("******** ODD NUMBER ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		boolean odd = isOdd(a);
		System.out.println("Is Odd: " + odd);

	}

	// 21. Maximum of Two Numbers
	static int maximum(int a, int b) {
		return Math.max(a, b);
	}

	// 22. Minimum of Two Numbers
	static int minimum(int a, int b) {
		return Math.min(a, b);
	}

	// 23. Maximum of Three Numbers
	static int maximumOfThree(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	// 24. Minimum of Three Numbers
	static int minimumOfThree(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}

	// 25. Absolute Value
	static int absoluteValue(int n) {
		return Math.abs(n);
	}

	// 26. Power
	static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	// 27. Square Root
	static double squareRoot(double n) {
		return Math.sqrt(n);
	}

	// 28. Cube Root
	static double cubeRoot(double n) {
		return Math.cbrt(n);
	}

	// 29. Even Number Check
	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	// 30. Odd Number Check
	static boolean isOdd(int n) {
		return n % 2 != 0;
	}

}
