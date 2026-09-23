package com.java;

public class Test6 {
	
	static int Count=0;
	
	Test6(){
		
		Count++;
		
	}

	public static void main(String[] args) {
		Test6 t1 = new Test6();
		Test6 t2 = new Test6();
		Test6 t3 = new Test6();
		Test6 t4 = new Test6();
		Test6 t5 = new Test6();
		System.out.println("count:"+Count);

	}

}
