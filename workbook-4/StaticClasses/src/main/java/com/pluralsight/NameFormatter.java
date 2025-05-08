package com.pluralsight;

public class NameFormatter {


    //private constructor
    private NameFormatter() {
    }
    public static String format(String firstName, String lastName){
        return lastName + " ," + firstName;
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
            StringBuilder stringbuilding = new StringBuilder(); // String builder maaaaybe?

        return prefix +"," + firstName + "," + middleName + "," + lastName + "," + suffix;//need a return in here. probably
    }
    public static String format (String fullName){



        return fullName;// need a return in here. probably
    }
}
