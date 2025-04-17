package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the theater! What is your full name?");
        String fullName = scanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1); //this will make it last name, first name when printed

        System.out.println("What date would you like to see a movie? (MM/dd/yyyy)"); //gets date customer wants to see movie
        String dateInputFromCustomer = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate userDate = LocalDate.parse(dateInputFromCustomer, formatter);

        System.out.println(userDate);

        System.out.println("How many tickets would you like?"); // gets amount of tickets from user
        int movieTickets = scanner.nextInt();

        if (movieTickets == 1) { //message changes based on if they pick one or more ticket(s)
            System.out.println("Thank you " + fullName + "!" + " We look forward to seeing you on " + userDate + " You have purchased " + movieTickets + " ticket!");
        } else {
            System.out.println("Thank you " + lastName + ", " + firstName + "!" + " We look forward to seeing you on " + userDate + " You have purchased " + movieTickets + " tickets!");
        }
            scanner.close();

        }

    }
