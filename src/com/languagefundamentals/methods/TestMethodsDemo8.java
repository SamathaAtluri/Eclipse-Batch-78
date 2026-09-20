package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo8 {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** KILOMETERS TO METERS ********");
		System.out.println("Enter kilometers:");
		double km = sc.nextDouble();
		double meter = kilometersToMeters(km);
		System.out.println("Meters: " + meter);

		System.out.println("******** METERS TO KILOMETERS ********");
		System.out.println("Enter meters:");
		meter = sc.nextDouble();
		double kilometer = metersToKilometers(meter);
		System.out.println("Kilometers: " + kilometer);

		System.out.println("******* METERS TO CENTIMETERS ********");
		System.out.println("Enter meters:");
		meter = sc.nextDouble();
		double cm = metersToCentimeters(meter);
		System.out.println("Centimeters: " + cm);

		System.out.println("******** CENTIMETERS TO METERS ********");
		System.out.println("Enter centimeters:");
		cm = sc.nextDouble();
		double meterValue = centimetersToMeters(cm);
		System.out.println("Meters: " + meterValue);

		
		System.out.println("******** KILOGRAMS TO GRAMS ********");
		System.out.println("Enter kilograms:");
		double kg = sc.nextDouble();
		double grams = kilogramsToGrams(kg);
		System.out.println("Grams: " + grams);

		System.out.println("******** GRAMS TO KILOGRAMS ********");
		System.out.println("Enter grams:");
		double gram = sc.nextDouble();
		double kgValue = gramsToKilograms(gram);
		System.out.println("Kilograms: " + kgValue);

		System.out.println("******** HOURS TO MINUTES ********");
		System.out.println("Enter hours:");
		int hours = sc.nextInt();
		int minutes = hoursToMinutes(hours);
		System.out.println("Minutes: " + minutes);

		System.out.println("******** MINUTES TO SECONDS ********");
		System.out.println("Enter minutes:");
		int minValue = sc.nextInt();
		int seconds = minutesToSeconds(minValue);
		System.out.println("Seconds: " + seconds);

		System.out.println("******** DAYS TO HOURS ********");
		System.out.println("Enter days:");
		int days = sc.nextInt();
		int hourValue = daysToHours(days);
		System.out.println("Hours: " + hourValue);

		System.out.println("******** WEEKS TO DAYS ********");
		System.out.println("Enter weeks:");
		int weeks = sc.nextInt();
		int dayValue = weeksToDays(weeks);
		System.out.println("Days: " + dayValue);

		System.out.println("******** SALARY AFTER INCREMENT ********");
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter increment percentage:");
		double increment = sc.nextDouble();
		double newSalary = salaryAfterIncrement(salary, increment);
		System.out.println("Salary After Increment: " + newSalary);

		System.out.println("******** SALARY AFTER DEDUCTION ********");
		System.out.println("Enter salary:");
		salary = sc.nextDouble();
		System.out.println("Enter deduction percentage:");
		double deduction = sc.nextDouble();
		double deductedSalary = salaryAfterDeduction(salary, deduction);
		System.out.println("Salary After Deduction: " + deductedSalary);

		System.out.println("******** FIND AGE ********");
		System.out.println("Enter current year:");
		int currentYear = sc.nextInt();
		System.out.println("Enter birth year:");
		int birthYear = sc.nextInt();
		int age = findAge(currentYear, birthYear);
		System.out.println("Age: " + age);

		System.out.println("********TOTAL MARKS ********");
		System.out.println("Enter Telugu marks:");
		int m1 = sc.nextInt();
		System.out.println("Enter English marks:");
		int m2 = sc.nextInt();
		System.out.println("Enter Maths marks:");
		int m3 = sc.nextInt();
		int marks = totalMarks(m1, m2, m3);
		System.out.println("Total Marks: " + marks);

		System.out.println("******** AVERAGE MARKS ********");
		System.out.println("Enter Telugu marks:");
		m1 = sc.nextInt();
		System.out.println("Enter English marks:");
		m2 = sc.nextInt();
		System.out.println("Enter Maths marks:");
		m3 = sc.nextInt();
		double marksAverage = averageMarks(m1, m2, m3);
		System.out.println("Average Marks: " + marksAverage);

	}

	// 41. Kilometers to Meters
	static double kilometersToMeters(double km) {
		return km * 1000;
	}

	// 42. Meters to Kilometers
	static double metersToKilometers(double meter) {
		return meter / 1000;
	}

	// 43. Meters to Centimeters
	static double metersToCentimeters(double meter) {
		return meter * 100;
	}

	// 44. Centimeters to Meters
	static double centimetersToMeters(double cm) {
		return cm / 100;
	}

	// 45. Kilograms to Grams
	static double kilogramsToGrams(double kg) {
		return kg * 1000;
	}

	// 46. Grams to Kilograms
	static double gramsToKilograms(double gram) {
		return gram / 1000;
	}

	// 47. Hours to Minutes
	static int hoursToMinutes(int hours) {
		return hours * 60;
	}

	// 48. Minutes to Seconds
	static int minutesToSeconds(int minutes) {
		return minutes * 60;
	}

	// 49. Days to Hours
	static int daysToHours(int days) {
		return days * 24;
	}

	// 50. Weeks to Days
	static int weeksToDays(int weeks) {
		return weeks * 7;
	}

	// 51. Salary After Increment
	static double salaryAfterIncrement(double salary, double percentage) {
		return salary + ((salary * percentage) / 100);
	}

	// 52. Salary After Deduction
	static double salaryAfterDeduction(double salary, double percentage) {
		return salary - ((salary * percentage) / 100);
	}

	// 53. Find Age
	static int findAge(int currentYear, int birthYear) {
		return currentYear - birthYear;
	}

	// 54. Find Total Marks
	static int totalMarks(int m1, int m2, int m3) {
		return m1 + m2 + m3;
	}

	// 55. Find Average Marks
	static double averageMarks(int m1, int m2, int m3) {
		return (m1 + m2 + m3) / 3.0;
	}

}
