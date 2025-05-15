package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int bedrooms, int squareFeet, int yearBuilt) {
        super(name, value);
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public double getValue() {
        return getValue();
    }
}
