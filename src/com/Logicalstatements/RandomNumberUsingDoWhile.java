
package com.Logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberUsingDoWhile {

    public static void main(String[] args) {

        Random rs = new Random();
        Scanner sc = new Scanner(System.in);

        int guess = rs.nextInt(10);
        int n;
        int i = 0;

        do {
        	
            System.out.println("Enter a Number:");
            n = sc.nextInt();

            if (n == guess) {
                System.out.println("Congratulations!...");
                break;

            } else if (n > guess) {
                System.out.println("Too High! Try Again...");

            } else {
                System.out.println("Low! Try Again....");
            }

            i++;

        } while (i < 3);

        System.out.println("Game Over");
        System.out.println("Your Guessing Number is: " + guess);

    }
    
    
}
