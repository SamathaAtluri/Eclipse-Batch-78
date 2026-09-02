package com.java;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");
		System.out.println("Good Morning..!");
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.java.Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ended");
		

	}

}
