package com.java;



class A {
	
	@Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method Called");
    }
	   B b;
	}

class B {
	
	@Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method Called");
    }
	   A a;
	}


public class Island {
	public static void main(String[] args) {
		       A obj1 = new A();
		       B obj2 = new B();

		       obj1.b = obj2;
		       obj2.a = obj1;

		       obj1 = null;
		       obj2 = null;
		       
		       System.gc();
		   }
}