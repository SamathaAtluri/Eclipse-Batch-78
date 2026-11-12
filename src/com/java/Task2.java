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
	 int summ(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
		
	}
	 double avg(double a ,double b) {
		 double avgg=a+b/2;
		 System.out.println(avgg);
		 
		 return avgg;
	 }
	 String Name(String name) {
		 System.out.println(name);
		 return name;
	 }
	
	public static void main(String[] args) {
		Task2 t1 = new Task2();
		
		System.out.println("Method Ended");
		t1.summ(10,10);
		t1.avg(10,8);
		t1.Name("Samatha");
		

		

	}

}
