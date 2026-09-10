package com.java;

public class Test3 {
	
	static int Count=0;
	
	{
		Count++;
		//System.out.println(Count);
	}


	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
		Test3 t4 = new Test3();
		Test3 t5 = new Test3();
		System.out.println(Count);
	
		

	}

}
