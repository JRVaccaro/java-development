package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Username and Password needed");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jbdc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);

        DataManager dataManager = new DataManager(northwindDataSource);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new shipper name: ");
        String shipperName = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.println("Enter Id to update");


        int newShipperId = dataManager.insertShipper(shipperName, phone);
        System.out.println("New shipper added with Id " + id);


        System.out.println("All Shippers");
        List<Shipper> shippers = dataManager.getAllShippers();
        dataManager.displayAllShippers();

        System.out.println("Enter ID of shipper to update phone number: ");
        int updateId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the new phone number");

        String newPhone = scanner.nextLine();


    }
    scanner.close();
}
}
