package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue(){
        double pricePerSquareFoot = 0;
        switch (condition){
            case 1:
                //Excellent condition
                pricePerSquareFoot = 180.00;
                break;

            case 2:
                //Good condition
                pricePerSquareFoot = 130.00;
                break;

            case 3:
                //Fair condition
                pricePerSquareFoot = 90.00;
                break;

            case 4:
                //Poor condition
                pricePerSquareFoot = 80.00;
                break;

            default:
                break;


        }
        //Calculating house value price per square foot * house size + 25cents * lot size
        return (pricePerSquareFoot * squareFoot) + (lotSize * 0.25);

    }
}
