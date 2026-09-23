package com.languagefundamentals.constructor;

public class Student {
	int sid;
	String sname;

// No-org Constructor
	Student() {
		sid = 101;
		sname = "sam";

	}

// Parameterized Constructor
	Student(int sid, String sname) {

	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.sid = 18;
		s1.sname = "sam";
		s1.studentinfo();

		Student s2 = new Student();
		s2.studentinfo();

		Student s3 = new Student(9, "sam");
		s3.studentinfo();

	}

	void studentinfo() {
		System.out.println("Student Id:" + sid);
		System.out.println("Student Name:" + sname);
	}

}
