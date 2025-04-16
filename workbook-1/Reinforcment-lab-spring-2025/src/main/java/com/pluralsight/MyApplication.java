package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = getName(myScanner);

        System.out.println("Enter your age");
        int age = myScanner.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
if(age >= 18) {
    System.out.println("You are old enough to vote!");
} else {
    System.out.println("You are not old enough!");
}
printMessage(name, age);
    }
    public static String getName(Scanner myScanner){
        System.out.println("Enter your name");
        String name = myScanner.nextLine();
        return name;
    }
    public static void printVotingEligibility(int age){
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        }

    }

    public static void printMessage(String name, int age){
        System.out.println("Hello, " + name + "! You are " + age " years old.");

        public static void printWelcomeMessage(String name) {
if (name.equals("Alice")){
    System.out.println("Hi Alice nice to see you!");
} else {
    System.out.println("Hi Stranger!");
}
    }
    public static void printDrinkingEligilbility(String name, int age){
            if(name.equalsIgnoreCase("Bob") && age >= 21) {
                System.out.println("Congrats Bob u can drink");
            } else {
                System.out.println("Sorry ur not bob and u cant drink");

                public static double getNumber(Scanner myScanner){
                    System.out.println("Enter a number");
                    return myScanner.nextDouble();
                }
            }
        }
}
