package com.Logicalstatements;

public class PrintingDuplicateElements {

	public static void main(String[] args) {
		int [] arr= {1,2,4,3,5,2,1,1,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
