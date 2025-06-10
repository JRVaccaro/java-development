package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // define your query
        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "yearup");

        // create statement
        // the statement is tied to the open connection
        PreparedStatement preparedStatement = connection.prepareStatement(query);



        // 2. Execute your query
        ResultSet results = preparedStatement.executeQuery();

        // process the results
        while (results.next()) {
            int productId = results.getInt("ProductID");
            String productName = results.getString("ProductName");
            double unitPrice = results.getDouble("UnitPrice");
            int unitsInStock = results.getInt("UnitsInStock");

            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Unit Price: " + unitPrice);
            System.out.println("Units In Stock: " + unitsInStock);
            System.out.println("---------------------");
        }

        // 3. Close the connection
        connection.close();


    }
}