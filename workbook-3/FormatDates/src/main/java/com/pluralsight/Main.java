package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // first date pattern
        String formattedDate = formatter.format(LocalDate.now());

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // second date pattern
        String formattedDate2 = formatter2.format(LocalDate.now());

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM, dd, yyyy");
        String formattedDate3 = formatter3.format(LocalDate.now());

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy, HH:mm:"); // third date pattern
        String formattedDate4 = formatter4.format(LocalDateTime.now());

        //my original attempt, which didnt work

   //     TimeZone timeZone = TimeZone.getTimeZone("Eastern");
     //   DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy, HH:mm:");
       // String formattedDate5 = formatter5.format(timeZone);

        ZoneId zoneId = ZoneId.of("GMT"); // had to look this up
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy, HH:mm 'in GMT'");
        String formattedDate5 = formatter5.format(zonedDateTime);



        System.out.println(formattedDate);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);
        System.out.println(formattedDate5);
    }
}
