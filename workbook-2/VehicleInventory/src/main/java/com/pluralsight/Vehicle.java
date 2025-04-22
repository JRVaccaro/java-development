package com.pluralsight;

public class Vehicle {
        private long vechileId;
        private String makeModel;
        private String color;
        private int odometerReading;
        private float price;

    public Vehicle(long vechileId, String makeModel, String color, int odometerReading, float price) {
        this.vechileId = vechileId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vechileId=" + vechileId +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }

    public long getVechileId() {
        return vechileId;
    }

    public void setVechileId(long vechileId) {
        this.vechileId = vechileId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

