
package com.java;

public class PDataTypes {

    short Employee_ID;
    byte Employee_age;
    int Employee_salary;
    char Employee_grade;
    float Years_of_experience;
    boolean isEmployeeactive;
    int Number_of_leaves;
    long Employee_phonenumber;
    static int leaves=10;

    
    void displayDetails() {

        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Employee Age: " + Employee_age);
        System.out.println("Employee Salary: " + Employee_salary + "K");
        System.out.println("Employee Grade: " + Employee_grade);
        System.out.println("Years Of Experience: " + Years_of_experience);
        System.out.println("Employee Is Active: " + isEmployeeactive);
        System.out.println("No of Leaves: " + Number_of_leaves);
        System.out.println("Phone Number: " + Employee_phonenumber);
    }
    void RemainingLeaves() {
    	leaves--;
    	System.out.println("Reamaning Leaves:"+leaves);
    	
    }
   

    public static void main(String[] args) {

      
        PDataTypes P = new PDataTypes();

        P.Employee_ID = 123;
        P.Employee_age = 34;
        P.Employee_salary = 55;
        P.Employee_grade = 'M';
        P.Years_of_experience = 3.5F;
        P.isEmployeeactive = true;
        P.Number_of_leaves = 6;
        P.Employee_phonenumber = 9876546743L;
        
        

        System.out.println("****Details of Employee 1*****");
        P.displayDetails();
        P.RemainingLeaves();


        // Employee 2
        PDataTypes P2 = new PDataTypes();

        P2.Employee_ID = 124;
        P2.Employee_age = 28;
        P2.Employee_salary = 65;
        P2.Employee_grade = 'A';
        P2.Years_of_experience = 5.2F;
        P2.isEmployeeactive = true;
        P2.Number_of_leaves = 3;
        P2.Employee_phonenumber = 9876543210L;

        System.out.println("\n****Details of Employee 2*****");
        P2.displayDetails();
        P2.RemainingLeaves();


        // Employee 3
        PDataTypes P3 = new PDataTypes();
        

        P3.Employee_ID = 125;
        P3.Employee_age = 31;
        P3.Employee_salary = 75;
        P3.Employee_grade = 'B';
        P3.Years_of_experience = 7.0F;
        P3.isEmployeeactive = false;
        P3.Number_of_leaves = 4;
        P3.Employee_phonenumber = 9123456789L;

        System.out.println("\n****Details of Employee 3*****");
        P3.displayDetails();
        P3.RemainingLeaves();
    }
    
}
