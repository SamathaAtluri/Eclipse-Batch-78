package com.Logicalstatements;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r = 0;
		String rev= "";
		while(n>0) {
			r=n%2;
			n=n/2;
			rev=r+rev;
		}
		System.out.println(rev);
		
	}
}