
package com.Logicalstatements;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Are you an Indian citizen? (true/false)");
        boolean citizen = sc.nextBoolean();

        if (age >= 0) {
            if (age >= 18) {
                if (citizen) {
                    System.out.println("Eligible to vote");
                } else {
                    System.out.println("Not eligible to vote");
                }
            } else {
                System.out.println("Not eligible to vote");
            }
        } else {
            System.out.println("Invalid age");
        }

        sc.close();
    }
}

