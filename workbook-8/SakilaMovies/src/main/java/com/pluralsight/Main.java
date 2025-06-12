package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("yearup");

      try ((Connection connection = dataSource.getConnection();
           Scanner scanner = new Scanner(System.in)){

          System.out.println("Enter last name of actor");
          String lastName =  scanner.nextLine();

          String actorsQuery = "Select first_name, last_name FROM actor WHERE last_name = ?";

          try (preparedStatement actorsStatement = connection.prepareStatement(actorsQuery)){
              actorsStatement.setString(1, lastName);

              try(Resultset actorsResult = actorsStatement.executeQuery()){
                  if (actorsResult.next){
                      System.out.println();
                  }
              }
          }
      }

    }
}
