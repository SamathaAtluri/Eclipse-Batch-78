package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** POSITIVE NUMBER ********");
		System.out.println("Enter number:");
		int a = sc.nextInt();
		boolean positive = isPositive(a);
		System.out.println("Is Positive: " + positive);


		System.out.println("******** NEGATIVE NUMBER ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		boolean negative = isNegative(a);
		System.out.println("Is Negative: " + negative);


		System.out.println("******** ZERO CHECK ********");
		System.out.println("Enter number:");
		a = sc.nextInt();
		boolean zero = isZero(a);
		System.out.println("Is Zero: " + zero);


		System.out.println("******** GREATER NUMBER ********");
		System.out.println("Enter a value:");
		a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();

		int greater = greaterNumber(a, b);
		System.out.println("Greater Number: " + greater);


		System.out.println("******** SMALLER NUMBER ********");

		System.out.println("Enter a value:");
		a = sc.nextInt();

		System.out.println("Enter b value:");
		b = sc.nextInt();

		int smaller = smallerNumber(a, b);
		System.out.println("Smaller Number: " + smaller);


		System.out.println("******** PERCENTAGE ********");

		System.out.println("Enter obtained marks:");
		double obtained = sc.nextDouble();

		System.out.println("Enter total marks:");
		double totalMarks = sc.nextDouble();

		double percent = percentage(obtained, totalMarks);
		System.out.println("Percentage: " + percent);


		System.out.println("******** DISCOUNT AMOUNT ********");

		System.out.println("Enter price:");
		double price = sc.nextDouble();

		System.out.println("Enter discount:");
		double discount = sc.nextDouble();

		double discountValue = discountAmount(price, discount);
		System.out.println("Discount Amount: " + discountValue);


		System.out.println("******** FINAL PRICE ********");

		System.out.println("Enter price:");
		price = sc.nextDouble();

		System.out.println("Enter discount:");
		discount = sc.nextDouble();

		double finalValue = finalPrice(price, discount);
		System.out.println("Final Price: " + finalValue);


		System.out.println("******** GST AMOUNT ********");

		System.out.println("Enter price:");
		price = sc.nextDouble();

		System.out.println("Enter GST:");
		double gst = sc.nextDouble();

		double gstValue = gstAmount(price, gst);
		System.out.println("GST Amount: " + gstValue);


		System.out.println("******** PRICE AFTER GST ********");

		System.out.println("Enter price:");
		price = sc.nextDouble();

		System.out.println("Enter GST:");
		gst = sc.nextDouble();

		double gstPrice = priceAfterGst(price, gst);
		System.out.println("Price After GST: " + gstPrice);

	}
	// 31. Positive Number Check
		static boolean isPositive(int n) {
		    return n > 0;
		}

		// 32. Negative Number Check
		static boolean isNegative(int n) {
		    return n < 0;
		}

		// 33. Zero Check
		static boolean isZero(int n) {
		    return n == 0;
		}

		// 34. Greater Number
		static int greaterNumber(int a, int b) {
		    return a > b ? a : b;
		}

		// 35. Smaller Number
		static int smallerNumber(int a, int b) {
		    return a < b ? a : b;
		}

		// 36. Percentage
		static double percentage(double obtained, double total) {
		    return (obtained / total) * 100;
		}

		// 37. Discount Amount
		static double discountAmount(double price, double discount) {
		    return (price * discount) / 100;
		}

		// 38. Final Price After Discount
		static double finalPrice(double price, double discount) {
		    return price - ((price * discount) / 100);
		}

		// 39. GST Amount
		static double gstAmount(double price, double gst) {
		    return (price * gst) / 100;
		}

		// 40. Price After GST
		static double priceAfterGst(double price, double gst) {
		    return price + ((price * gst) / 100);
		}

}
