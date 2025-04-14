package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Name: "); //allows user to enter name
        String Name = myScanner.nextLine();

        System.out.println("Please Enter Hours Worked:  "); //allows user to add hours worked
        float numOfHours = myScanner.nextFloat();

        System.out.println("Please Enter Pay Rate "); //allows user to add pay rate
        float payRate = myScanner.nextFloat();

        float grossPay = payRate * numOfHours;
        System.out.println("Your Name Is: " + Name + " Your Gross Pay Is: " + grossPay);
// calculates gross pay

if (numOfHours > 40) {
    grossPay = (float) (40 * payRate + (numOfHours - 40) * 1.5 * payRate);
}   else {
    grossPay = numOfHours * payRate;
}
    System.out.println("Name: " + Name);
    System.out.println("Gross Pay $" + String.format("%.2f", grossPay));

}

    }

