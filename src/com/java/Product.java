package com.java;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;

	Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	Product(Product P1, int quantity) {
		this.productId = P1.productId;
		this.productName = P1.productName;
		this.price = P1.price;
		this.quantity = quantity;
	}

	void display() {
		System.out.println("Product Id:" + productId);
		System.out.println("Product Name:" + productName);
		System.out.println("Price of the Product:" + price);
		System.out.println("Quantity:" + quantity);
		//System.out.println("Total Price:" + calculateTotal());
		calculateTotal();
		
	}

	void calculateTotal() {
		//return price * quantity;
		System.out.println("Total Price:"+price*quantity);
	}

	public static void main(String[] args) {
		Product P1 = new Product(123, "Soaps", 100, 2);
		P1.display();
		System.out.println("***************************");
		Product P2 = new Product(P1, 3);
		P2.display();

	}

}
