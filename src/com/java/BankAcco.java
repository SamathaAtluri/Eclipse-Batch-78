package com.java;

public class BankAcco {

	static int balance = 1000;

	public static void main(String[] args) {
		deposit(1000);
		withdrawel(500);
		balance(balance);

	}

	static void deposit(int d) {
		balance=balance+d;
		System.out.println("Deposited Money: " + d);

	}

	static void withdrawel(int w) {
		balance= balance-w;
		System.out.println("Withdrawel Money:" + w);

	}

	static void balance(int b) {
		System.out.println("Balance  Amount:"+b);
	}

}
