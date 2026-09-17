package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

// ==Operator checks the values if the data is Primitive.
// ==Operator checks the address if the data is Object Types.


class Dog{
	
	String name;
	Dog(String name){
		this.name=name;		
	}
	
}

class Cat{
	
	String name;
	Cat(String name){
		this.name=name;
	}
	
}

public class DatatypesDemo2 {
	
///All these are Instance Variables
/// all these are class , every class is  object and for every object 
/// the JVM will provide the default value as null
	//Pre-defined Normal Object Data types
	
//String is a collection of characters store it into a double quotes.
//It is a string Literal
	String str="Samatha";
	
	String str1 = new String();//String Object-->stored in Heap Memory
	String str2 = new String("Samatha");//String Object
	
	//The Below object is created wit help of Default Constructor provided by java compiler
	//Whenever  your class does not contain any other constructor then only  java compiler provides default constructor
	//DatatypesDemo2 d1 = new DatatypesDemo2();
	
	// CE:Type mismatch: cannot convert from int to BigInteger
	//BigInteger bi=100;
	
	///We Cannot create object to BigInteger because there is no No-org Constructor
	//BigInteger bi= new BigInteger();//The constructor BigInteger() is undefined
	BigInteger bi = new BigInteger("6556899987654434567887654333456");
	
	//Translates the decimal String Representation of a BigInteger into a BigInteger 
    BigInteger bi1 = new BigInteger("7897665433456789876543335677654");
    BigInteger bi2 = new BigInteger("7897665433456789876543335677654");
	
	BigDecimal bd = new BigDecimal("33.4566");
	
	BigDecimal bd1 = new BigDecimal("345677.7765433455");
	BigDecimal bd2 = new BigDecimal("398866554.09827752");
	
//	Pre-defined Wrapper Object Data types
//	Primitive Data Types works with Auto-Boxing and Auto-UnBoxing
//	Converting Primitive to Wrapper Object Data Tyoes is called Auto-Boxing
//	Converting Wrapper to Primitive Data Types is called Auto-UnBoxing
	Integer in=100; //int-->Integer --->Auto-Boxing
//	Internally it works with valueOf() Method Integer class
//	Integer in1 = Integer.valueOf(100);
//	Internally it works with intValue() or byteValue()
//	int a1 = in.intValue(100);
	
	
//	The constructor Integer(int) is deprecated since version 9	
//	Integer i2 = new Integer("100");
	
	
	Float f=5.5F;
	Character ch='M';
	Boolean boo=true;
	
	//User-defined Object Data types
	Dog d = new Dog("Puppy");
	Cat c = new Cat("Cat");
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		// -128 to 127  --> Internally its taking the same address
		//If the values are more than 127 then for every value its creating new object will consider as 
		// Wrapper caching
		// ==Operator checks the values if the data is Primitive.
		// ==Operator checks the address if the data is Object Types.
//		Integer Object is commonly having 16 bytes of memory but the exact memory footprints depends on the JVM
		
		int i5 = 200;
		int i6 = 200;
		System.out.println(i5==i6);
		
		Object i7 =200;//int-->Integer-->Object
		byte a = 10;
		byte b = (byte)(a+30);
		System.out.println(b);
		
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1==i2);//true
		
		Integer i3 =200;
		Integer i4 = 200;
		System.out.println(i3==i4);//false
		
		
		
		
		DatatypesDemo2 d1 = new DatatypesDemo2();
		
		//System.out.println(d1.bi1+d1.bi2); - we cannot use + for some objects
		
		System.out.println("BIG INTEGER ADDITION:"+d1.bi1.add(d1.bi2));// to add two BigIntegers
		System.out.println(d1.bi1);
		System.out.println(d1.bi2);
		
		System.out.println("BIG INTEGER MULTIPLY :"+d1.bi1.multiply(d1.bi2));
		
		System.out.println(d1.str);//null
		System.out.println(d1.str2+"-Vcube");// + Concatination Operator for the String 

		System.out.println(d1.bi);//null
		
		System.out.println(d1.bi);//null

		System.out.println(d1.bd);//null
		System.out.println(d1.bd1);
		System.out.println(d1.bd2);
		System.out.println("BIG DECIMAL ADDITION: "+d1.bd1.add(d1.bd2));
		System.out.println("BIG DECIMAL INT VALUE: "+d1.bd1.add(d1.bd2).intValue());
		System.out.println("BIG DECIMAL DOUBLE VALUE: "+d1.bd1.add(d1.bd2).doubleValue());
		System.out.println("BIG DECIMAL LONG VALUE: "+d1.bd1.add(d1.bd2).longValue());
		System.out.println("BIG DECIMAL FLOAT VALUE: "+d1.bd1.add(d1.bd2).floatValue());
		System.out.println("BIG DECIMAL MULTIPLY VALUE: "+d1.bd1.multiply(d1.bd2));
		System.out.println("BIG DECIMAL SUBTRACT VALUE: "+d1.bd1.subtract(d1.bd2));
		System.out.println("BIG DECIMAL STRING VALUE: "+d1.bd1.add(d1.bd2).toString());

		System.out.println(d1.in);//null

		System.out.println(d1.f);//null

		System.out.println(d1.ch);//null

		System.out.println(d1.boo);//null

		System.out.println(d1.d.name);//null
		

		System.out.println(d1.c.name);//null
		
		
		

	}

}
