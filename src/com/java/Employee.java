package com.java;

public class Employee {
	
	 int empId;
	 String empName;
	 float empSalary;
	 
	 void display() {
		 System.out.println("Employee Id:"+empId);
		 System.out.println("Employee Name:"+empName);
		 System.out.println("Employee Salary:"+empSalary+"K");
	 }

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println("Details of Employee 1");
		e1.empId=321;
		e1.empName="Samatha";
		e1.empSalary=25000;
		e1.display();
		
		Employee e2 = new Employee();
		System.out.println("Details of Employee 2");
		e2.empId=322;
		e2.empName="Bhagya";
		e2.empSalary=26000;
		e2.display();
		
		Employee e3 = new Employee();
		System.out.println("Details of Employee 3");
		e3.empId=323;
		e3.empName="Sathvika";
		e3.empSalary=30000;
		e3.display();
		
		Employee e4 = new Employee();
		System.out.println("Details of Employee 4");
		e4.empId=324;
		e4.empName="Chaitanya";
		e4.empSalary=28000;
		e4.display();
		
		Employee e5 = new Employee();
		System.out.println("Details of Employee 5");
		e5.empId=325;
		e5.empName="Uma";
		e5.empSalary=29000;
		e5.display();
		
	}

}
