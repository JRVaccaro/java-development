package com.pluralsight;

import java.util.Scanner;

public class QuotesApp {
    public static void main(String[] args) {
        String[] quotes = {
                "All that glitters is not gold",
                "A stitch in time saves nine",
                "Actions speak louder than words",
                "Honesty is the best policy",
                "You can't have your cake and eat it too",
                "The early bird catches the worm",
                "An apple a day keeps the doctor away",
                "There's no place like home",
                "When in Rome, do as the Romans do",
                "You reap what you sow"
        };

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number between 1-10 to display a specific quote:");
            System.out.print("Your choice: ");

            int indexFromUser = scanner.nextInt();

            System.out.println(quotes[indexFromUser - 1]);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }


    }

}
