package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                String outputLine = "";
                //System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n", employee.getId(), employee.getName(), employee.getGrossPay());
                outputLine = String.format("%d|%s|%.2f\n", employee.getId(), employee.getName(), employee.getGrossPay()))

               writer.write(outputLine);

            }


            bufferedReader.close();
        }catch (Exception ex) {
            System.out.println("Error!");
        }
    }
}