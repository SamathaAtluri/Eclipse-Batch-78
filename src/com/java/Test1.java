package com.java;

public class Test1 {
	
	static void method1(){
		
		
		System.out.println("Method 1 Called");
	}
	
	void show() {
		method1();
		
		System.out.println("Method Show called");
	}
	
	public static void Welcome(){
		
		Test1 t = new Test1();
		t.show();
		System.out.println("Welcome to Java");
		
	}

	public static void main(String[] args) {
		System.out.println("Method started");
		Welcome();
		System.out.println("Method Ended");

	}

}
