package com.languagefundamentals.methods;

public class MethodsExamples {

	public static void main(String[] args) {
		System.out.println("main method started");

		areaofCircle(6);

		Circumference(8);

		areaofRectangle(2, 3);

		areaofTriangle(4, 5);

		perimeterofRectangle(6, 8);

		perimeterofTriangle(3, 4, 5);

		SimpleIntrest(10000, 5, 2);

		AsimpleIntrest(10000, 5, 2);

		AvgOf3(10, 20, 30);

		Percentage(450, 500);

		Speed(100, 2);

		Distance(50, 2);

		Time(100, 50);

		CelsiustoFahrenheit(37);

		FahrenheittoCelsius(98.6);

		Kilometerstometers(5);

		Meterstokilometers(5000);

		Discountamount(2000, 10);

		Finalpriceafterdiscount(2000, 10);

		Electricitybill(100, 5.5);

		Calculateageafter5years(21);

		Calculatesalaryafterbonus(30000, 5000);

		System.out.println("main method Ended");

	}

	public static void areaofCircle(double r) {
		System.out.println("1.Area of the Circle");
		System.out.println((3.14) * r * r);
	}

	public static void Circumference(double r) {
		System.out.println("2.Circumference of the Circle");
		System.out.println(2 * (3.14) * r);
	}

	public static void areaofRectangle(int l, int b) {
		System.out.println("3.Area of the Rectangle");
		System.out.println(l * b);
	}

	public static void areaofTriangle(int l, int b) {
		System.out.println("4.Area of the Triangle");
		System.out.println(2 * (l + b));
	}

	public static void perimeterofRectangle(int l, int b) {
		System.out.println("5.Perimeter of Rectangle");
		System.out.println(2 * (l + b));
	}

	public static void perimeterofTriangle(int a, int b, int c) {
		System.out.println("6.Perimeter of Triangle");
		System.out.println(a + b + c);
	}

	public static void SimpleIntrest(double p, double r, double t) {
		System.out.println("7.Simple Intrest");
		System.out.println((p * t * r) / 100);
	}

	public static void AsimpleIntrest(double p, double r, double t) {
		System.out.println("8.Amount with simple Intrest");
		System.out.println(p + ((p * t * r) / 100));
	}

	public static void AvgOf3(int a, int b, int c) {
		System.out.println("9.Average of three Numbers");
		System.out.println((a + b + c) / 3);

	}

	public static void Percentage(double marks, double total) {
		System.out.println("10.Percentage");
		System.out.println((marks / total) / 100);
	}

	public static void Speed(double distance, double time) {
		System.out.println("11.Speed");
		System.out.println(distance / time);
	}

	public static void Distance(double speed, double time) {
		System.out.println("12.Distance");
		System.out.println(speed * time);
	}

	public static void Time(double distance, double speed) {
		System.out.println("13.Time");
		System.out.println(distance / speed);
	}

	public static void CelsiustoFahrenheit(double c) {
		System.out.println("14.Celsius to Fahrenheit");
		System.out.println((c * (9 / 5)) + 32);
	}

	public static void FahrenheittoCelsius(double f) {
		System.out.println("15.Fahrenheit to Celsius");
		System.out.println((f - 32) * (5 / 9));
	}

	public static void Kilometerstometers(double km) {
		System.out.println("16.Kilometers to meters");
		System.out.println(km * 1000);
	}

	public static void Meterstokilometers(double m) {
		System.out.println("17.Meters to kilometers");
		System.out.println(m / 1000);
	}

	public static void Discountamount(double price, double discount) {
		System.out.println("18.Discount amount");
		System.out.println((price * discount) / 100);
	}

	public static void Finalpriceafterdiscount(double price, double discount) {
		System.out.println("19.Final price after discount");
		System.out.println(price - discount);
	}

	public static void Electricitybill(int units, double rate) {
		System.out.println("20.Electricity bill");
		System.out.println(units * rate);
	}

	public static void Calculateageafter5years(int age) {
		System.out.println("21.Calculate age after 5 years");
		System.out.println(age + 5);
	}

	public static void Calculatesalaryafterbonus(double salary, double bonus) {
		System.out.println("22.Calculate salary after bonus");
		System.out.println(salary + bonus);
	}

}
