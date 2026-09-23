package com.java;

public class EmployeeDetails {

	int eid;
	String ename;
	double esal;

	EmployeeDetails(int eid, String ename, double esal) {
		//this. calls current class variables
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails(1, "samatha", 200000);
		e1.empinfo();

	}

	void empinfo() {
		System.out.println("Employee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" + esal);
	}

}
