package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like? Regular or Large? "); //asks user to pick size of sandwich
        String sandwichSize = myScanner.nextLine();

        double basePrice = 0.0;
        if (sandwichSize.equals("Regular")) {
            basePrice = 5.45;


        } else if (sandwichSize.equals("Large")) {
            basePrice = 8.95;
        } else {
            System.out.println("We don't have that size in stock!");

        }

        System.out.println("You picked a " + sandwichSize + " sandwich");
        System.out.println("The price is " + String.format("%.2f", basePrice));

        System.out.println("We offer discounts based on age! Please enter age: "); //asks user for age
        int age = myScanner.nextInt();
        double discount = 0.0;

        if (age < 18) {
            discount = 0.10;
        } else if (age >= 65) {
        discount = 0.20;
    } else {
            System.out.println("No discount for sandwich!");
        }
        double finalPrice = basePrice - (basePrice * discount); //calculates final price
        System.out.println("Your total is: " + String.format("%.2f", finalPrice)); //Displays cost of sandwich
    }
}
