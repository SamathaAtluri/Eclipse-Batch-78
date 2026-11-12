package com.java;

public class Employeee {
	int empId;
	String empName;
	double salary;

	Employeee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	
	void empDetails() {
		double bonus = salary*10/100;
		double finalSalary = salary+bonus;
		
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+salary);
		System.out.println(bonus);
		System.out.println("Bonus:"+finalSalary);
	}

	public static void main(String[] args) {
		Employeee e1 = new Employeee(1001, "Samatha", 23000.00);
		e1.empDetails();
		

	}

}
