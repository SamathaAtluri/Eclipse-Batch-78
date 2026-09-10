package com.java;

public class Students {
	static String CollegeName="QIS";
	String Name;
	int Age;
	
	
	void display() {
		Name="Samatha";
		Age=21;
		System.out.println("College Name: "+CollegeName);
		System.out.println("Name: "+Name);
		System.out.println("Age:"+Age);
		
		Name="Bhagya";
		Age=21;
		System.out.println("College Name: "+CollegeName);
		System.out.println("Name: "+Name);
		System.out.println("Age:"+Age);
	}

	public static void main(String[] args) {
		Students s1 =new Students();
		s1.display();
		
	}

}
