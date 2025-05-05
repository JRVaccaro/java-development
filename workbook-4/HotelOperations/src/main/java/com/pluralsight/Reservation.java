package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(boolean isWeekend, int numberOfNights, double price, String roomType) {
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.price = price;
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("King")){
            this.price = 145.00;

        } else if (roomType.equals("double")) {
            this.price = 100.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal(){
        double totalPrice = price * numberOfNights;
        if (isWeekend){
            totalPrice *= 1.1;
            // total price = total price + total price *(10/100)
        }
    }
}

