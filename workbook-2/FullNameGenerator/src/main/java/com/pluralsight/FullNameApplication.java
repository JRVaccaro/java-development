package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String trimmedFirstName = scanner.nextLine().trim();

        System.out.println("What is your middle initial?");
        String trimmedMiddleInitial = scanner.nextLine().trim();

        System.out.println("What is your last name?");
        String trimmedLastName = scanner.nextLine().trim();

        System.out.println("What is your suffix?");
        String trimmedSuffix = scanner.nextLine().trim();

        String fullName = trimmedFirstName;

        if (!trimmedMiddleInitial.isEmpty()) {
            fullName = fullName + " " + trimmedMiddleInitial;

            fullName = fullName + " " + trimmedLastName;
        }

        if(!trimmedSuffix.isEmpty()) {
            fullName = fullName + ", " + trimmedSuffix;
        }
        System.out.println("Full name: " + fullName);
    }
}

