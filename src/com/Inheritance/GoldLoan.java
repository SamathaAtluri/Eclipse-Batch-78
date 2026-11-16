package com.Inheritance;

public class GoldLoan extends Loan {

	public static void main(String[] args) {
		GoldLoan gl = new GoldLoan();
		
		System.out.println("Welcome To Samatha Bank - Gold Loan");
		int age = gl.getAge();
		int cibil = gl.getCibilScore();
		
		if(age>=25 && cibil >=300 && cibil<=900) {
			System.out.println("Congratulations your are Eligible for Gold Loan");
			System.out.println("Your Rate of Intrest is:"+gl.getROI(cibil));
			
		}else {
			System.out.println("Sorry !! Your Gold Loan is Rejected");
		}

	}

}
