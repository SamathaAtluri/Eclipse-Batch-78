package com.java;

public class test7 {
	String accname;
	int accnum;
	String Location;
	String branch;

	test7(test7 t, String accname, int accnum) {
		this.accname = accname;
		this.accnum = accnum;
		this.Location = t.Location;
		this.branch = t.branch;

	}

	test7(String accname, int accnum, String Location, String branch) {
		this.accname = accname;
		this.accnum = accnum;
		this.Location = Location;
		this.branch = branch;

	}

	public static void main(String[] args) {

		System.out.println("Customer1");
		test7 t = new test7("samatha", 2345, "HYD", "kphb");
		t.display();

		test7 t1 = new test7(t,"Bhagya",34566);
		System.out.println("Customer2");

		t1.display();

	}

	void display() {
		System.out.println("Account Holder name:" + accname);
		System.out.println("Account Number:" + accnum);
		System.out.println("Location:" + Location);
		System.out.println("Branch:" + branch);
	}

}
