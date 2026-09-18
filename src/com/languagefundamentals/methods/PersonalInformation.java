package com.languagefundamentals.methods;

import java.util.Scanner;

public class PersonalInformation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your First Name:");
		String fname = sc.nextLine();

		System.out.println("Enter Your Last Name:");
		String lname = sc.nextLine();

		System.out.println("Enter Your Gender:");
		String gender = sc.nextLine();

		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Your Date of Birth:");
		String dob = sc.nextLine();

		System.out.println("Enter Your Phone Number:");
		long pno = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter Your Email:");
		String email = sc.nextLine();

		System.out.println("Enter Your Address:");
		String address = sc.nextLine();

		System.out.println("Enter Your Nationality:");
		String nationality = sc.nextLine();

		System.out.println("Enter Your State:");
		String state = sc.nextLine();

		System.out.println("Enter Your City:");
		String city = sc.nextLine();

		System.out.println("Enter Your Father Name:");
		String father = sc.nextLine();

		System.out.println("Enter Your Mother Name:");
		String mother = sc.nextLine();

		System.out.println("Enter Your Sibling Count:");
		int siblings = sc.nextInt();

		System.out.println("Enter Your Height:");
		double height = sc.nextDouble();

		System.out.println("Enter Your Weight:");
		double weight = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter Your Blood Group:");
		String blood = sc.nextLine();

		System.out.println("Enter Your Hobbies:");
		String hobbies = sc.nextLine();

		System.out.println("Enter Your Favorite Color:");
		String color = sc.nextLine();

		System.out.println("Enter Your Favorite Food:");
		String food = sc.nextLine();

		System.out.println("Enter Your Instagram Username:");
		String instagram = sc.nextLine();

		System.out.println("Enter Your Qualification:");
		String qualification = sc.nextLine();

		System.out.println("Enter Your College:");
		String college = sc.nextLine();

		System.out.println("Enter Your Graduation Year:");
		int year = sc.nextInt();
		
		System.out.println("Enter Your 10th Marks:");
        double tenth = sc.nextDouble();

        System.out.println("Enter Your Intermediate Marks:");
        double inter = sc.nextDouble();

        System.out.println("Enter Your B.Tech CGPA:");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Your Favorite Movie:");
        String movie = sc.nextLine();

        System.out.println("Enter Your Favorite Hero:");
        String hero = sc.nextLine();

        System.out.println("Enter Your Favorite Heroine:");
        String heroine = sc.nextLine();

        
		System.out.println("\n---------- PERSONAL INFORMATION ----------");

		System.out.println("Name: " + fname + " " + lname);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Phone Number: " + pno);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
		System.out.println("Nationality: " + nationality);
		System.out.println("State: " + state);
		System.out.println("City: " + city);
		System.out.println("Father Name: " + father);
		System.out.println("Mother Name: " + mother);
		System.out.println("Sibling Count: " + siblings);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Blood Group: " + blood);
		System.out.println("Hobbies: " + hobbies);
		System.out.println("Favorite Color: " + color);
		System.out.println("Favorite Food: " + food);
		System.out.println("Instagram Username: " + instagram);
		System.out.println("Qualification: " + qualification);
		System.out.println("College: " + college);
		System.out.println("Graduation Year: " + year);
		System.out.println("10th Marks: " + tenth);
        System.out.println("Intermediate Marks: " + inter);
        System.out.println("B.Tech CGPA: " + cgpa);
        System.out.println("Favorite Movie: " + movie);
        System.out.println("Favorite Hero: " + hero);
        System.out.println("Favorite Heroine: " + heroine);
    }
}