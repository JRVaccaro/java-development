package com.pluralsight;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
     /*   String welcome ="Big Tex \nsays \"Howdy\""; // moves text underneath and puts double quotes on howdy
        String s1 = "ABC";
                String s2 = new String("ABC");
        System.out.println("This is s1: " + s1);
        System.out.println("This is s2 " + s2);

        if (s1.equals(s2)) {
            System.out.println("This is true");
        }else {
            System.out.println("This is false");
        }
    }
}


      */
        String fullName = "Julianna Vac";

        int length = fullName.length();
        System.out.println(length);

        String username = " danaw            ";
        System.out.println(username);

        String trimmedUserName = username.trim();
        System.out.println(trimmedUserName);


        String name = "julianna";
        String upperCasedName = name.toUpperCase();
        System.out.println(upperCasedName);

        String newName = "JULIANNA";
        System.out.println(newName.toLowerCase());

        String instructorName = "         julianna          ";
        System.out.println(instructorName.trim().toUpperCase());

        String secondName = "Julianna";

        if (secondName.toLowerCase().startsWith("jul")) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }

        String discountCode = "SAVE-50";

        if (discountCode.endsWith("-50")) {
            System.out.println("This is True");
        }

        String product = "Chips";

        char letter = product.charAt(0); // starts counting from 0, which is C
        System.out.println(letter);


        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-"); //starts counting at 0, which would be 4
        System.out.println(dashPosition);

        String teacherName = "Raymond";
        String nickname = teacherName.substring(0,3); // cuts first half of name
        System.out.println(nickname);

        nickname = teacherName.substring(6);
        System.out.println(nickname);

    }

}