package com.pluralsight.collection;

public class Trip {
    private String organizer;

    private String destination;

    private int numTravelers;

    public Trip(String organizer, String destination, int numTravelers) {
        this.organizer = organizer;
        this.destination = destination;
        this.numTravelers = numTravelers;
    }
    public class Car {

        private String make;

        private String model;

        public Car(String make, String model) {

            this.make = make; this.model = model;

        }

        public void start() {

            System.out.println("Starting the " + make + " " + model);

        }

    }
}
