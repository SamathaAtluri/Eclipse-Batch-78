package com.Logicalstatements;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		int[] array = new int[size];
		int even=0;
		int odd=0;
		System.out.println("Enter numbers:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			if (array[i] % 2 == 0) {
				even++;
			} else if (array[i] % 2 == 1) {
				odd++;
			}
		}

//		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int even = 0;
//   	int odd = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] % 2 == 0) {
//				even++;
//		} else if (array[i] % 2 == 1) {
//			odd++;
//		}
//		}
		System.out.println("Even Count:" + even);
		System.out.println("Odd Count:" + odd);

	}

}
