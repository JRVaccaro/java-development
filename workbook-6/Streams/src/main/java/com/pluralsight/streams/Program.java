package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();


        people.add(new Person("Alice", "Wonder",25));
        people.add(new Person("Bob", "Newt",30));
        people.add(new Person("Charlie", "Felitn",22));
        people.add(new Person("Diana", "Stone",28));
        people.add(new Person("Ethan", "Slade", 35));
        people.add(new Person("Fiona", "Yonu", 27));
        people.add(new Person("George", "Tree",31));
        people.add(new Person("Hannah", "Hopp",24));
        people.add(new Person("Ian", "Chuck",29));
        people.add(new Person("Jasmine", "Williams", 30));

        nameSearch(people);
        calculateAge(people);
    }
    public static void nameSearch(List<Person> people){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first or last name: ");
        String userInput = scanner.nextLine().trim();

        boolean found = false;

        for (Person person : people){
            if (person.getFirstName().equalsIgnoreCase(userInput) || person.getLastName().equalsIgnoreCase(userInput)){
                System.out.println(person.getFirstName()+ " " + person.getLastName()+ ": Age: " + person.getAge());
                found = true;
            }
        }
        if (!found){
            System.out.println("No match found.");
        }
    }
    public static void calculateAge(List<Person> people){
        int totalAge = 0;
        int maxAge = 0;
        int minAge = 0; //wrong?




        for (Person person : people){
            int age = person.getAge();
            totalAge += age;

            if (age > maxAge){
                maxAge = age;
            }
            if (age < minAge){ //need to fix i think
                minAge = age;
            }
        }
        double averageAge = (double) totalAge /  people.size();

        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + maxAge);
        System.out.println("Youngest age: " + minAge);

    }
}
