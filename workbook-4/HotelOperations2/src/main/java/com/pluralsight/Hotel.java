package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    //constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //constructor 2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;


    }

    //getters, no setters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    //derived getter
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    //derived getter
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    //booking method
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (numberOfRooms <= 0) {
            return false;
        }
        if (isSuite) {
           if (numberOfRooms <= getAvailableSuites()) {
               bookedSuites += numberOfRooms;
               return true;
           }
        } else {
            if (numberOfRooms <= getAvailableRooms()){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
}
