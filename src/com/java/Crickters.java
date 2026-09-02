package com.java;

public class Crickters {

    // 1. Declaration

    // Static variables
    static int countryId;
    static String countryName;

    // Instance variables
    int jersyno;
    String playername;

    // Static block
    static {
        System.out.println("Main method Started...");
    }

    // Main method
    public static void main(String[] args) {

        // 2. Initialization
    	System.out.println("Obj1 created************");
        countryId = 1;
        countryName = "Team India";
        // Object Creation
        Crickters msd = new Crickters();
        msd.jersyno = 07;
        msd.playername="Mahendra Singh Dhoni";
        // 3. Accessing
        System.out.println("Welcome to Team India");
        System.out.println("Team number: " + countryId);
        System.out.println("Team name: " + countryName);
        System.out.println("Jersey Number: " + msd.jersyno);
        System.out.println("Player Name: " + msd.playername);
        
        
        System.out.println("Obj2 created************");
        countryId = 1;
        countryName = "Team India";
        // Object Creation
        Crickters vk = new Crickters();
        vk.jersyno = 18;
        vk.playername="Virat Kohli";
        // 3. Accessing
        System.out.println("Welcome to Team India");
        System.out.println("Team number: " + countryId);
        System.out.println("Team name: " + countryName);
        System.out.println("Jersey Number: " + vk.jersyno);
        System.out.println("Player Name: " + vk.playername);
        System.out.println("Main method Ended");
    }
}