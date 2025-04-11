package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1
        double bobSalary = 75000.0;
        double garySalary = 95000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Highest salary Is " + highestSalary);

        // Question 2
        double carPrice = 60000.0;
        double truckPrice = 10000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Lowest price is " + smallestPrice);

        // Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("This is the PI " + area);

        // Question 4
        double squareRoot = 5.0;
        squareRoot = Math.sqrt(squareRoot);
        System.out.println("This is the square root " + squareRoot);

        // Question 5
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The diance between the points is: " + distance);

        //Question 6
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + " is " + absNum2);

        // Question 7 IMPORTANT
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);
    }

}
