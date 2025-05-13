package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {

        int currentYear = LocalDate.now().getYear(); //getting current year

        int age = currentYear - year; //age of vehicle by subtracting year of vehicle from current year
        double value;

        if (age <= 3) {
            //(1 - 0.03 * age) means start with 100% (that's the '1') and subtract 3% for each year
            value = getOriginalCost() * (1 - 0.3 * age);
        } else if (age <= 6) {
            value = getOriginalCost() * (1 - 0.06 * (age - 3)); //6% after 3 years
        } else if (age <= 10) {
            value = getOriginalCost() * (1 - 0.08 * (age - 6)); //8% after 6 years
        } else {
            value = 1000.0; //Over 10 years
        }
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75; //reduce value by 25% if odometer is over 100,000 and not a honda or a toyota
        }

/*/ A car's value is determined as
// 0-3 years old - 3% reduced value of cost per year
// 4-6 years old - 6% reduced value of cost per year
// 7-10 years old - 8% reduced value of cost per year
// over 10 years old - $1000.00
// MINUS reduce final value by 25% if over 100,000 miles
// unless makeModel contains word Honda or Toyota

 */
        return value;
    }
}