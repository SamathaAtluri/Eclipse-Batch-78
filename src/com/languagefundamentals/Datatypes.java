package com.languagefundamentals;

public class Datatypes {
	//byte = 8bits
	// by default RHS values are int.
	//CE: byte b = 128; - Type mismatch: cannot convert from int to byte
	// byte values starts from -128 to 127
	byte b=(byte) 130;//-126 = Converting int to byte will consider as Explict Type casting 
	byte b1=(byte) 257;
	
	//short = 2 bytes = 16 bits
	//-32768 to 32767
	//Type mismatch: Cannot convert from int to short
	short s = (short) 32768;
	short s1 = 32767;
	short s2=b1;//Implicit Type casting : Converting byte to short
	
	//int = 4 bytes = 32 bits
	// -2147483648 to 2147483647
	int i=2147483647;
	//The literal 2147483648 of type int is out of range
	//int i1=2147483648; - we cannot convert because it is out of range
	 int i1 = (int) 2147483648L; //Explicit Type Casting Long to int
	
	//long = 8 bytes = 64 bits = 2^63
	//-9,223,372,036,854,775,808 to  9,223,372,036,854,775,807
	long l= 3445262727L;
	long l1= 9223372036854775807L;
	
	//By default RHS decimal point data will consider as double
	//So when we represent float value we must provide f or F as suffix
	//Type mismatch: cannot convert from double to float
	float f = 5.9F;
	float f1 = 56338339898.746837892F;
	float f2 = 8287117634376487829382930293230F;
	double d = 7577389283928387236.7263288239283928D;
	
	//char = 2 bytes = -32767 + 32768 = 65535 ---> 0 to 65535
	//A=65 B=66.......M=77 N=78......Z=90
	//a=97 b=98... m=109 n=110....z=122
	char c='A';// single quote characters 
	char c1 = 65;//ASCII values
	
	char c2='\u0040';//Unicode values or Hex char values
	char c3='\u0020';
	char c4='\u0041';
	char c5= 654;//These are called jung characters
	
	
	boolean boo=true; // Only Valid
	boolean boo1=false;// Only Valid
	
//	boolean boo2=0; - Invalid
//	boolean boo3=1; - Invalid 
	
//	boolean boo4=True; - Invalid
//	boolean boo5=False; - Invalid
	
//	boolean boo6=TRUE; - Invalid
//	boolean boo7=FALSE; - Invalid
	
//	boolean boo8="true"; - Invalid
//	boolean boo9="false"; - Invalid
	
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Datatypes t1 = new Datatypes();
		
		System.out.println("byte:"+t1.b);//-126
		System.out.println("byte b1:"+t1.b1);//1
		
		System.out.println("short:"+t1.s);//0
		System.out.println("short s1:"+t1.s1);//32767
		
		System.out.println("Int:"+t1.i);//0
		
		System.out.println("Long:"+t1.l);//0
		
		System.out.println("Float:"+t1.f);//0
		System.out.println("Float f1:"+t1.f1);//0
		
		System.out.println("Double:"+t1.d);//0.0
		
		System.out.println("Char:"+t1.c);// 
		System.out.println("Char1 c1:"+t1.c1);//
		System.out.println("Char1 c2:"+t1.c2);//
		System.out.println("Char1 c3:"+t1.c3);//
		System.out.println("Char1 c4:"+t1.c4);//
		System.out.println("Char1 c5:"+t1.c5);//
		
		System.out.println("Boolean:"+t1.boo);//false
		System.out.println("Boolean:"+t1.boo1);
		System.out.println("main method ended");

	}

}
