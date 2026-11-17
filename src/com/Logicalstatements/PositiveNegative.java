package com.Logicalstatements;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		int[] num = new int[size];
		int positive = 0;
		int negative = 0;
		System.out.println("Enter Numbers:");
		for (int i = 0; i < size; i++) {
			num[i]=sc.nextInt();
;			if (num[i] > 0) {
				positive++;
			} else if (num[i] < 0) {
				negative++;

			}

//		int[] num = { 1, 0, -1, -3, -2, 3, 6, 9, 7, -5, -9, -4 };
//		int positive = 0;
//		int negative = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] > 0) {
//			positive++;
//		} else if (num[i] < 0) {
//			negative++;

//			}
		}
		System.out.println("Positive Number Count:" + positive);
		System.out.println("Negative Number Count:" + negative);

	}

}
