package com.pluralsight;

public class CellPhone {
    private int serialNumber;

    private String phoneModel;

    private String carrier;

     private String phoneNumber;

     private String owner;

     public CellPhone() {
         this.serialNumber = 0;
         this.phoneModel = "";
         this.carrier = "";
         this.phoneNumber = "";
         this.owner = "";
     }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
