package com.java;

public class BankAccount {
	
	int AccountNumber;
	String Name;
	int balance;
	
	static int accountNoGenerater=12345;
	
	{
		accountNoGenerater++;
		AccountNumber=accountNoGenerater;
	}

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.Name="Samatha";
		b1.balance=5000;

		System.out.println("Account Holder Name: "+b1.Name);
		System.out.println("Balance: "+b1.balance);
		System.out.println("Account Number: "+b1.AccountNumber);
		
		BankAccount b2 = new BankAccount();
		b2.Name="Bhagya";
		b2.balance=6000;
		System.out.println("Account Holder Name: "+b2.Name);
		System.out.println("Balance: "+b2.balance);
		System.out.println("Account Number:"+b2.AccountNumber);
		
		
		

	}

}
