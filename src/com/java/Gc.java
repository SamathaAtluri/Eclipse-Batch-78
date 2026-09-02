package com.java;

public class Gc {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method Called");
    }

    void Hello() {
        System.out.println("Hello World");

        // Out of Scope
        Gc g4 = new Gc();
    }

    public static void main(String[] args) {

        System.out.println("Method Started");

        // 1. Nullifying the Object
        Gc g1 = new Gc();
        g1 = null;

        // 2. Reassigning the Object
        Gc g2 = new Gc();
        Gc g3 = new Gc();

        g3 = g2;

        // 3. Out of Scope
        {
            Gc g4 = new Gc();
        }

        // 4. Anonymous Object
        new Gc().Hello();

        // Request Garbage Collection
        System.gc();

        System.out.println("Method Ended");
    }
}