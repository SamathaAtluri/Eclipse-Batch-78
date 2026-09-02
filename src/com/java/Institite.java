package com.java;

public class Institite {

    static String TrainerName1;
    static String TrainerName2;

    int Employeeid;
    String EmployeeName;
    String EmployeeDesignation;

    public static void main(String[] args) {

        System.out.println("**Details of Employee1**");

        Institite t = new Institite();

        t.Employeeid = 101;
        t.EmployeeName = "Samatha";
        t.EmployeeDesignation = "JFS Developer";
        TrainerName1="Srikanth";

        System.out.println("Employee Id: " + t.Employeeid);
        System.out.println("Employee Name: " + t.EmployeeName);
        System.out.println("Employee Designation: " + t.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee2**");

        Institite sam = new Institite();

        sam.Employeeid = 102;
        sam.EmployeeName = "Bhagya Lakshmi";
        sam.EmployeeDesignation = "Devops Developer";

        System.out.println("Employee Id: " + sam.Employeeid);
        System.out.println("Employee Name: " + sam.EmployeeName);
        System.out.println("Employee Designation: " + sam.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee3**");

        Institite b = new Institite();

        b.Employeeid = 103;
        b.EmployeeName = "Uma Maheswari";
        b.EmployeeDesignation = "PFS";

        System.out.println("Employee Id: " + b.Employeeid);
        System.out.println("Employee Name: " + b.EmployeeName);
        System.out.println("Employee Designation: " + b.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee4**");

        Institite c = new Institite();

        c.Employeeid = 104;
        c.EmployeeName = "Chaitanye";
        c.EmployeeDesignation = "AI Developer";
        TrainerName2="viswantha";

        System.out.println("Employee Id: " + c.Employeeid);
        System.out.println("Employee Name: " + c.EmployeeName);
        System.out.println("Employee Designation: " + c.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName2);
        
        
        
        System.out.println("**Details of Employee5**");

        Institite s = new Institite();

        s.Employeeid = 105;
        s.EmployeeName = "Sathwika";
        s.EmployeeDesignation = "SQL Developer";

        System.out.println("Employee Id: " + s.Employeeid);
        System.out.println("Employee Name: " + s.EmployeeName);
        System.out.println("Employee Designation: " + s.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName2);
        
        
    }
}