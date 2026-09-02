package com.java;

public class College {
	
	static String CollegeName;
	
	int StudentId;
	String StudentName;
	int Marks;

	public static void main(String[] args) {
		System.out.println("****Details of Student1****");
		CollegeName="QIS";
		
		College qis = new College();
		
		qis.StudentId=1;
		qis.StudentName="Samatha";
		qis.Marks=100;
		
		System.out.println("College Name: " + CollegeName);
		System.out.println("Student Id: " + qis.StudentId);
		System.out.println("Student Name: " + qis.StudentName);
		System.out.println("Student Marks: " + qis.Marks);
		
		System.out.println("****Details of Student2****");
		CollegeName="QIS";
		 
		College qiss = new College();
		
		qiss.StudentId=2;
		qiss.StudentName="Bhagya Laskshmi";
		qiss.Marks=100;
		
		System.out.println("College Name: " + CollegeName);
		System.out.println("Student Id: " + qiss.StudentId);
		System.out.println("Student Name: " + qiss.StudentName);
		System.out.println("Student Marks: " + qiss.Marks);
		
		System.out.println("****Details of Student3****");
		CollegeName="DSU";
		
		College dsu = new College();
		
		dsu.StudentId=3;
		dsu.StudentName="Uma";
		dsu.Marks=100;
		
		System.out.println("College Name: " + CollegeName);
		System.out.println("Student Id: " + dsu.StudentId);
		System.out.println("Student Name: " + dsu.StudentName);
		System.out.println("Student Marks: " + dsu.Marks);
		
		
		

	}

}
