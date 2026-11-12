package com.Logicalstatements;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary Number:");
        int n = sc.nextInt();

        int dec = 0;
        int r = 0;
        int p = 1;

        while(n > 0) {

            r = n % 10;
            dec = dec + (r * p);
            p = p * 2;
            n = n / 10;
        }

        System.out.println("Decimal Number: " + dec);
    }
}