package com.languagefundamentals;

//A class itself is a user defined data type
class Address{
	String flat="LIG-123";
	String plot="567";
	String city="HYD";
	String street="KPHB";
}

public class Employee {
	int eid = 107;
	String name = "Samatha";
	Address address = new Address();

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		System.out.println(emp1.eid);
		System.out.println(emp1.name);
		System.out.println(emp1.address.flat);
		System.out.println(emp1.address.plot);
		System.out.println(emp1.address.city);
		System.out.println(emp1.address.street);
		

	}

}
