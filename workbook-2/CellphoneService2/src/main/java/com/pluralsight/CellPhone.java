package com.pluralsight;

public class CellPhone {
    // store phone details
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() { // constructor with default values
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialNumber() { // getter for serial number
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) { // setter for serial number
        this.serialNumber = serialNumber;
    }

    public String getModel() { // getter for model
        return model;
    }

    public void setModel(String model) { // setter for model
        this.model = model;
    }

    public String getCarrier() { // getter for carrier
        return carrier;
    }

    public void setCarrier(String carrier) { // setter for carrier
        this.carrier = carrier;
    }

    public String getPhoneNumber() { // getter for phone number
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { // setter for phone number
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() { // getter for owner
        return owner;
    }

    public void setOwner(String owner) { // setter for owner
        this.owner = owner;
    }
    public void dial(String phoneNumber){ //method for calling a phone number
        System.out.println("\n" + owner + "is calling: " + phoneNumber); // displays message showing owner is calling a number

    }

    }