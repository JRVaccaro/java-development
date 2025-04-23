package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("goldilocks.txt");
            FileInputStream fis2 = new FileInputStream("hansel_and_gretel.txt");
            FileInputStream fis3 = new FileInputStream("mary_had_a_little_lamb.txt");

            Scanner scanner1 = new Scanner(fis1);
            Scanner scanner2 = new Scanner(fis2);
            Scanner scanner3 = new Scanner(fis3);
            Scanner scanner = new Scanner(System.in); //user input

            String line1;
            String line2;
            String line3;


            System.out.println("Please select a children's book");
            System.out.println("1. Goldilocks");
            System.out.println("2. Hansel and Gretel");
            System.out.println("3. Mary had a little lamb");
            System.out.print("You picked: ");
            int choice = scanner.nextInt(); //takes user choice as int

            switch (choice) {
                case 1:
                    System.out.println("You selected goldilocks!");
                    printBook(scanner1); //prints content of goldilocks
                    break;
                case 2:
                    System.out.println("You selected Hansel and Gretel!");
                    printBook(scanner2); //prints content of hansel and gretel
                    break;
                case 3:
                    System.out.println("You selected Mary had a Little Lamb");
                    printBook(scanner3); //prints content of mary and lamb
                    break;
                default:
                    System.out.println("Invalid");
            }
            scanner1.close();
            scanner2.close();
            scanner3.close();

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
public static void printBook(Scanner bookScanner) { //method to print content of books
    while (bookScanner.hasNextLine()) {
    String line = bookScanner.nextLine();
                System.out.println(line); //print each line of book
            }
        }

    }

