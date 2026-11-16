
package com.Logicalstatements;

import java.util.Scanner;

public class Supermarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int n;
        double total = 0;
        double discount = 0;
        double finalAmount = 0;

        while(true) {

            System.out.println("\n1. Add Product");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Apply Discount");
            System.out.println("4. Display Final Amount");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("Enter number of products:");
                    n = sc.nextInt();

                    for(int i=1; i<=n; i++) {

                        System.out.println("Enter product name:");
                        String name = sc.next();

                        System.out.println("Enter product price:");
                        double price = sc.nextDouble();

                        total = total + price;

                        System.out.println(name + " Added");
                    }

                    discount = 0;
                    break;

                case 2:

                    System.out.println("Total Price: " + total);
                    break;

                case 3:

                    if(total > 10000) {

                        discount = total * 15 / 100;

                        System.out.println("15% Discount Applied");

                    } else {

                        discount = 0;
                        System.out.println("No Discount");
                    }

                    break;

                case 4:

                    finalAmount = total - discount;

                    System.out.println("Total Bill: " + total);
                    System.out.println("Discount: " + discount);
                    System.out.println("Final Amount: " + finalAmount);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
