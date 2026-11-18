package com.Logicalstatements;

import java.util.Arrays;

public class RoundingMarks {

	public static void main(String[] args) {
		int[] arr = { 99, 95, 71, 84, 75, 60 };
		for (int i = 0; i < arr.length; i++) {

			int r = arr[i] % 10;
			if (r > 5) {
				arr[i] = arr[i] + (10 - r);
			} else {
				arr[i] = arr[i] - r;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
// double num;
// num=Math.round(arr[i]/10.0f)*10;
