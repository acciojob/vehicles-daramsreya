package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat ferry = new Boat("Ferry King", 100);
        System.out.println("Boat Name: " + ferry.getVehicleName());
        System.out.println("Boat Capacity: " + ferry.getVehicleCapacity());
    }
}