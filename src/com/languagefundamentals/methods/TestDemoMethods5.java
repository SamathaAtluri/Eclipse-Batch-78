package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestDemoMethods5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** PERIMETER OF RECTANGLE ********");
		System.out.println("Enter length:");
		int a = sc.nextInt();
		System.out.println("Enter breadth:");
		int b = sc.nextInt();
		int rectanglePerimeter = perimeterOfRectangle(a, b);
		System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);


		System.out.println("******** AREA OF TRIANGLE ********");
		System.out.println("Enter base:");
		double base = sc.nextDouble();
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		double triangleArea = areaOfTriangle(base, height);
		System.out.println("Area of Triangle: " + triangleArea);


		System.out.println("******** AREA OF CIRCLE ********");
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		double circleArea = areaOfCircle(radius);
		System.out.println("Area of Circle: " + circleArea);


		System.out.println("******** CIRCUMFERENCE OF CIRCLE ********");
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		double circumference = circumferenceOfCircle(radius);
		System.out.println("Circumference of Circle: " + circumference);


		System.out.println("******** AVERAGE OF TWO NUMBERS ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		double avg = average(a, b);
		System.out.println("Average: " + avg);


		System.out.println("******** AVERAGE OF THREE NUMBERS ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		System.out.println("Enter c value:");
		int c = sc.nextInt();
		double avg3 = averageOfThree(a, b, c);
		System.out.println("Average of three numbers: " + avg3);

		
		System.out.println("******** SIMPLE INTEREST ********");
		System.out.println("Enter principal:");
		double p = sc.nextDouble();
		System.out.println("Enter rate:");
		double rate = sc.nextDouble();
		System.out.println("Enter time:");
		double time = sc.nextDouble();
		double si = simpleInterest(p, rate, time);
		System.out.println("Simple Interest: " + si);


		System.out.println("******** TOTAL AMOUNT ********");
		System.out.println("Enter principal:");
		double principal = sc.nextDouble();
		System.out.println("Enter interest:");
		double interest = sc.nextDouble();
		double total = totalAmount(principal, interest);
		System.out.println("Total Amount: " + total);


		System.out.println("******** CELSIUS TO FAHRENHEIT ********");
		System.out.println("Enter Celsius:");
		double cel = sc.nextDouble();
		double fahrenheit = celsiusToFahrenheit(cel);
		System.out.println("Fahrenheit: " + fahrenheit);

		
		System.out.println("******** FAHRENHEIT TO CELSIUS ********");
		System.out.println("Enter Fahrenheit:");
		fahrenheit = sc.nextDouble();
		double celsius = fahrenheitToCelsius(fahrenheit);
		System.out.println("Celsius: " + celsius);

	}

	// 11. Perimeter of Rectangle
	static int perimeterOfRectangle(int length, int breadth) {
		return 2 * (length + breadth);
	}

	// 12. Area of Triangle
	static double areaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}

	// 13. Area of Circle
	static double areaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	// 14. Circumference of Circle
	static double circumferenceOfCircle(double radius) {
		return 2 * Math.PI * radius;
	}

	// 15. Average of Two Numbers
	static double average(int a, int b) {
		return (a + b) / 2.0;
	}

	// 16. Average of Three Numbers
	static double averageOfThree(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

	// 17. Simple Interest
	static double simpleInterest(double p, double r, double t) {
		return (p * r * t) / 100;
	}

	// 18. Total Amount
	static double totalAmount(double principal, double interest) {
		return principal + interest;
	}

	// 19. Celsius to Fahrenheit
	static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	// 20. Fahrenheit to Celsius
	static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
