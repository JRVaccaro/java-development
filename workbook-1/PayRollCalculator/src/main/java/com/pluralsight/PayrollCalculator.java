package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String Name = myScanner.nextLine();

        System.out.println("Please Enter Hours Worked:  ");
        float numOfHours = myScanner.nextFloat();

        System.out.println("Please Enter Pay Rate ");
        float payRate = myScanner.nextFloat();

        float grossPay = payRate * numOfHours;
        System.out.println("Your Name Is !" + Name + " Your Gross Pay Is: " + grossPay);
    }
}
