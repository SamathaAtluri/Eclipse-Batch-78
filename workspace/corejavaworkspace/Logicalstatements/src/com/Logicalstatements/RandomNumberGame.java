package com.Logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		Random rs = new Random();
		int guess = rs.nextInt(10);
		
		
		for(int i=0;i<3;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number:");
			int n = sc.nextInt();
			if(n==guess) {
				System.out.println("Congratulations!...");
				break;
			}else if(n>guess) {
				
				System.out.println("Too High! Try Again...");
			}else{
				System.out.println("Low! Try Again....");
				
			}
			
		}
		System.out.println("Game Over");
		System.out.println("Your Guessing Number is:"+guess);

	}

}
