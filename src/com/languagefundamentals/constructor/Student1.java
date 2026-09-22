package com.languagefundamentals.constructor;

public class Student1 {
	
	Student1(){
		
		System.out.println("Constructor Called");
		
	}
	
	{
		System.out.println("Instance block Called");
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1();
	}

}
