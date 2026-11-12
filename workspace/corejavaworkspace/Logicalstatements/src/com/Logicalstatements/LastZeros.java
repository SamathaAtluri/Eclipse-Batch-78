package com.Logicalstatements;

public class LastZeros {
	public static void main(String[] args) {
		int[] arr = { 9, 0, 7, 0, 4, 1, 2, 0, 3 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int index = arr[i];
				arr[i] = arr[j];
				arr[j] = index;

				j++;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}