package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);

		System.out.println("****ADDITION******");
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b  value:");
		int b = sc.nextInt();
		int add = add(a, b);
		System.out.println("Addition of two numbers:" + add);

		System.out.println("*****SUBTRACTION*****");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		int subResult = subtract(a, b);
		System.out.println("Subtraction of two numbers: " + subResult);

		System.out.println("******** MULTIPLICATION ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		int mulResult = multiply(a, b);
		System.out.println("Multiplication of two numbers: " + mulResult);

		System.out.println("******** DIVISION ********");
		System.out.println("Enter a value:");
		double x = sc.nextDouble();
		System.out.println("Enter b value:");
		double y = sc.nextDouble();
		double divResult = divide(x, y);
		System.out.println("Division of two numbers: " + divResult);

		System.out.println("******** REMAINDER ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		b = sc.nextInt();
		int remResult = remainder(a, b);
		System.out.println("Remainder: " + remResult);

		System.out.println("******** SQUARE ********");
		System.out.println("Enter side:");
		a = sc.nextInt();
		int squareResult = square(a);
		System.out.println("Square: " + squareResult);

		System.out.println("******** CUBE ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		int cubeResult = cube(a);
		System.out.println("Cube: " + cubeResult);

		System.out.println("******** AREA OF SQUARE ********");
		System.out.println("Enter side:");
		a = sc.nextInt();
		int squareArea = areaOfSquare(a);
		System.out.println("Area of Square: " + squareArea);

		System.out.println("******** PERIMETER OF SQUARE ********");
		System.out.println("Enter side:");
		a = sc.nextInt();
		int squarePerimeter = perimeterOfSquare(a);
		System.out.println("Perimeter of Square: " + squarePerimeter);

		System.out.println("******** AREA OF RECTANGLE ********");
		System.out.println("Enter length:");
		a = sc.nextInt();
		System.out.println("Enter breadth:");
		b = sc.nextInt();
		int rectangleArea = areaOfRectangle(a, b);
		System.out.println("Area of Rectangle: " + rectangleArea);
	}

	// 1. Addition
	static int add(int a, int b) {
		return a + b;
	}

	// 2. Subtraction
	static int subtract(int a, int b) {
		return a - b;
	}

	// 3. Multiplication
	static int multiply(int a, int b) {
		return a * b;
	}

	// 4. Division
	static double divide(double a, double b) {
		return a / b;
	}

	// 5. Remainder
	static int remainder(int a, int b) {
		return a % b;
	}

	// 6. Square
	static int square(int n) {
		return n * n;
	}

	// 7. Cube
	static int cube(int n) {
		return n * n * n;
	}

	// 8. Area of Square
	static int areaOfSquare(int side) {
		return side * side;
	}

	// 9. Perimeter of Square
	static int perimeterOfSquare(int side) {
		return 4 * side;
	}

	// 10. Area of Rectangle
	static int areaOfRectangle(int length, int breadth) {
		return length * breadth;
	}

}
