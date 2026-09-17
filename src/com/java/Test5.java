package com.java;

public class Test5 {

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		int s = 10;
		t1.addition(20,30);
	}

	void addition(int a, int b) {
		System.out.println(a + b);
		int s=a+b;
		subtraction(s,5);

	}

	void subtraction(int a, int b) {
		System.out.println(a - b);
		int e=a-b;
		Multiplication(e,5);
	}

	void Multiplication(int a, int b) {
		System.out.println(a * b);
		int f=a*b;
		Division(f,10);
	}

	void Division(int a, int b) {
		System.out.println(a / b);
	}

}
