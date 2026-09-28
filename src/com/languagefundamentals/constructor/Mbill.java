package com.languagefundamentals.constructor;

public class Mbill {

	String Mobile_model;
	int Quantity;
	double Price;
	double Delivery_charge;

	int Mobile_cost;
	int Final_bill;

	Mbill() {
		this("Samsung M05");
	}

	Mbill(String Mobile_model) {
		this(Mobile_model, 1);
	}

	Mbill(String Mobile_model, int Quantity) {
		this(Mobile_model, Quantity, 20000);
	}

	Mbill(String Mobile_model, int Quantity, double Price) {
		this(Mobile_model, Quantity, Price, 33.00);
	}

	Mbill(String Mobile_model, int Quantity, double Price, double Delivery_charge) {

		this.Mobile_model = Mobile_model;
		this.Quantity = Quantity;
		this.Price = Price;
		this.Delivery_charge = Delivery_charge;

		Mobile_cost = (int) (Price * Quantity);
		Final_bill = (int) (Mobile_cost + Delivery_charge);
	}

	public static void main(String[] args) {

		System.out.println("Mobile Info");

		Mbill m1 = new Mbill();

		m1.display();
	}

	void display() {

		System.out.println("Display mobile model: " + Mobile_model);
		System.out.println("Price of the Mobile: " + Price);
		System.out.println("Quantity: " + Quantity);
		System.out.println("Cost of the Mobile: " + Mobile_cost);
		System.out.println("Delivery Charges: " + Delivery_charge);
		System.out.println("Final Bill: " + Final_bill);
	}
}