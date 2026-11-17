package com.Logicalstatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int s = n * n;
			n = s / 10;
			sum = s + n;
		}
		n = sum;
		if (temp == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");
		}

	}

}
