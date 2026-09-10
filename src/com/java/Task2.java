package com.java;


public class Task2 {
	
	static void Method1(){
		System.out.println("Method 1 Called");
		
	}
	static void Method2() {
		Method1();
		System.out.println("Method 2 Called");
		
	}
	
	void Method3() {
		Method2();
		System.out.println("Method 3 Called");
		
	}
	void Method4() {
		Method3();
		System.out.println("Method 4 Called");
		
	}
	
	
	static {
		System.out.println("Static Block Called");
		new Task2();
		Task2 t1=new Task2();
		t1.Method4();
	}

	{
		System.out.println("Instance Block Called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Method Ended");

		

	}

}
