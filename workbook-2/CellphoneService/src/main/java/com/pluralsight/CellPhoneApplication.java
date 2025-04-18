package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number?");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();


        System.out.println("What is the model of the phone?");
        phone.setPhoneModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of this phone?");
        phone.setOwner(scanner.nextLine());

        StringBuilder phoneBuilder = new StringBuilder();
        phoneBuilder.append("\nPhone Information\n");
        phoneBuilder.append("Serial number: ").append(phone.getSerialNumber()).append("\n");
        phoneBuilder.append("Model: ").append(phone.getPhoneModel()).append("\n");
        phoneBuilder.append("Carrier: ").append(phone.getCarrier()).append("\n");
        phoneBuilder.append("Phone number: ").append(phone.getPhoneNumber()).append("\n");
        phoneBuilder.append("Owner: ").append(phone.getOwner()).append("\n");

        System.out.println(phoneBuilder.toString());

        scanner.close();

    }
}
