package com.java;
//BankAccount with the following instance variables: accountNumber, accountHolderName, balance, branch

//Requirements:

//› Create a parameterized constructor to initialize all account details.
//>  Create a copy constructor that accepts another BankAccount object and copies its values.
//› Create a method displayAccountdetails) to display the account information.
//In the main method:
//Create an original BankAccount object.
//Create a second object using the copy constructor.
//Change the branch and balance of the copied account.
//Display both objects •

public class BankAccount2 {
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;

	BankAccount2(int accountNumber, String accountHolderName, double balance, String branch) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount2(BankAccount2 b) {
		this.accountNumber = b.accountNumber;
		this.accountHolderName = b.accountHolderName;
		this.balance = b.balance;
		this.branch = b.branch;
	}
	
	void display() {
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Balance:" + balance);
		System.out.println("Branch:" + branch);
	}


	public static void main(String[] args) {
		BankAccount2 b = new BankAccount2(22345, "Samatha", 2345.89, "KPHB");
		
		BankAccount2 b2 = new BankAccount2(b);
   
        b2.branch = "Madhapur";
        b2.balance = 5000.50;

        System.out.println("Original Account:");
        b.display();

        System.out.println();
        System.out.println("Copied Account:");
        b2.display();
    }
}