package com.languagefundamentals.constructor;


public class Car {
	String model;
	String brand;
	int year;
	double price;
	Car(){
		this("Creta");
		}
	Car(String model){
		this(model,"Hyundai");
		System.out.println("one constructor");
	}
	Car(String model, String brand){
		this(model,brand,2026);
		System.out.println("two constructor");
	}
	Car(String model, String brand,int year){
		this(model,brand,year,20000);
		System.out.println("three constructor");
		
	}
	Car(String model, String brand,int year,double price){
		System.out.println("four constructor");
		this.model=model;
		this.brand=brand;
		this.year=year;
		this.price=price;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Car c=new Car();
		c.carinfo();		
		
	

	}
	void carinfo() {
		System.out.println("car model:"+model);
		System.out.println("car brand:"+brand);
		System.out.println("car buy year:"+year);
		System.out.println("car price:"+price);
	}

}
