package com.java;
//WAP to Represent Only Indian Cricket Team 

//Whenever the data is not changing from Object to Object then go and make sure that data as static.
//Whenever the data is changing from Object to Object then go and make sure that data as instance.
//For Every Object a new copy will be created with default values for instance data.
//For all Objects same copy will be using with recent values for static data.

//Method Area : 
//	- All static related information like variables & blocks even with metadata is storing inside the Method Area 
//whenever the class loading.  
//- Without Object Creating, we can load & access static related information.

//Heap Area 
//	- All instance related information like instance variables & instance blocks 
//are loading into the Heap area whenever we created an object.

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

//		Accessing the instance data 
//		Note : In static area, We cannot access the instance data directly.
//		CE : Cannot make a static reference to the non-static field jerseyNumber
//		CE : Cannot make a static reference to the non-static field cricketerName

//		If we want to access instance data in static area, 
//		we must need to create an Object.

//		LHS : Cricketer is a class name & msd is a Object Reference variable
//		RHS : new is the Java keyword to create Objects & Cricketer() constructor calling.
//		Whenever a class does not contain any constructor then Java Compiler will create default constructor.
		// Object Creation
		Crickters msd = new Crickters();
		msd.jersyno = 07;
		msd.playername = "Mahendra Singh Dhoni";
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
		vk.playername = "Virat Kohli";
		// 3. Accessing
		System.out.println("Welcome to Team India");
		System.out.println("Team number: " + countryId);
		System.out.println("Team name: " + countryName);
		System.out.println("Jersey Number: " + vk.jersyno);
		System.out.println("Player Name: " + vk.playername);
		System.out.println("Main method Ended");
	}
}