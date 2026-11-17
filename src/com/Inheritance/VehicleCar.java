package com.Inheritance;

class Vehicle {

    int speed = 50;

    void display() {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {

    int speed = 100;

    @Override
    void display() {
        System.out.println("Car speed: " + speed);
    }
}

public class VehicleCar {

    public static void main(String[] args) {

        Vehicle v = new Car();

        System.out.println("Vehicle speed:"+v.speed);

        v.display();
    }
}
