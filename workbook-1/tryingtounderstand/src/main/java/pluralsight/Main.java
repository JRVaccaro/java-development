package pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  String firstWord = "Hello";
        String secondWord = "World";

        String Greeting = firstWord + " " + secondWord;

        System.out.println(Greeting);
        // crtl alt L will allign code



       int firstNumber = 10;
        int secondNumber = 3;
        int result; // this will show what 10 + 3 is
        result = firstNumber + secondNumber;
        System.out.println(result);
        result = firstNumber - secondNumber; // this will show what 10 - 7 is
        System.out.println(result);

        // multiply
        result = firstNumber * secondNumber;
        System.out.println(result);

        // divide
        result = firstNumber / secondNumber;
        System.out.println(result);

        result = firstNumber % secondNumber;
        System.out.println(result);

        result = secondNumber - (firstNumber % secondNumber);
        System.out.println(result);

        int x = 5;
        int y;

      // x++; x = x + 1;
        System.out.println("===========");
        y = ++x;
        System.out.println(y);
        System.out.println(x);

        y = x++; // y will equal 6, but x will equal 7 since the plus signs are at the end
        System.out.println(y);
        System.out.println(x);

        long firstNumber = 1000000000000000L;
        float secondNumber = 3.45f;

        long ssn = 111_22_3333L;;




        int myInt;
        long myLong =  9;
        myInt = (int) myLong;

        System.out.println(myInt);


        double value = 1234.567;
        int wholeNumber = (int) Math.round(value);

        System.out.println(wholeNumber);

        double expressionResult = 1 - 2 * Math.pow(2, 2);
        System.out.println(expressionResult);

        int firstNumber = 5;
        int secondNumber = 10;

        int minimumNumber = Math.min(firstNumber, secondNumber);

        System.out.println(minimumNumber);



        int answer = 0;
        // answer = answer + 10;
        answer += 10;
        System.out.println(answer);

        answer = answer + 10; // answer += 10
        answer = answer - 5; // 5
        answer = answer * 10; // 50
        answer = answer / 2; // 25
        answer = answer % 10; // 5 (int remainder of 25 / 10)

        answer += 1; // answer++;



       // System.out.println(); //sout
       // System.out.print();

        float subTotal = 22.87f;
        float tax = subTotal * 0.0825f;
        float totalDue = subTotal + tax;
        System.out.println(totalDue);
        System.out.println("Total due is " + String.format("%.2f", totalDue));

        System.out.printf("Total due is %.2f", totalDue);

        int id = 10135;
        String name = "Brandon Plysers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f ", name, id, pay);



        Scanner potatoScanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = potatoScanner.nextLine();

        System.out.println("Hello everyone I am " + name + " and I love potatoes!");

        System.out.println("Please enter a number: ");
        int firstNumber = potatoScanner.nextInt();
        System.out.println("The number is: " + firstNumber);

       */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Which operation you would like to do next?");
        String response = scanner.nextLine();

        System.out.println("The first number is: " + num1 + " and the second number is: " + num2);

        System.out.println("The operation is: " + response);
    }
}