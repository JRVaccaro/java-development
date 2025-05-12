package com.pluralsight;

public class Main {
    public static void main(String[] args) {
    Moped slowRide = new Moped();
    slowRide.setColor("Red");
    slowRide.setFuelCapacity(5);

    Car littleCar = new Car();
    littleCar.setNumberOfDoors(4);
    littleCar.accelerate();
    littleCar.setColor("Blue");

    }
}
