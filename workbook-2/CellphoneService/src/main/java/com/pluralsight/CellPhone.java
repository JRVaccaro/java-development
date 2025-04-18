package com.pluralsight;

public class CellPhone {
    // store phone information
    private int serialNumber;

    private String phoneModel;

    private String carrier;

     private String phoneNumber;

     private String owner;

     public CellPhone() { // default constructor
         this.serialNumber = 0;
         this.phoneModel = "";
         this.carrier = "";
         this.phoneNumber = "";
         this.owner = "";
     }
// getter for serial number
    public int getSerialNumber() {
        return serialNumber;
    }
// setter for serial number
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
// getter for phone model
    public String getPhoneModel() {
        return phoneModel;
    }
// setter for phone model
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
// getter for phone carrier
    public String getCarrier() {
        return carrier;
    }
// setter for phone carrier
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
// getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
// setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
// getter for owner
    public String getOwner() {
        return owner;
    }
// setter for owner
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
