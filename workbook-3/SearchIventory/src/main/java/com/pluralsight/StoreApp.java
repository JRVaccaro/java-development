package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();

        listAllProducts(inventory);


            }


    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();


        String line;
        try{

            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
                while ((line = bufferedReader.readLine()) != null){
                    String[] parts = line.split("\\|");
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);

                    inventory.add(new Product(id, name, price));
}
        }catch (Exception ex){
            System.out.println("error");
        }


            //* inventory.add(new Product(1, "Shirt", 19.99));
            //inventory.add(new Product(2, "Pants", 29.99));
            //inventory.add(new Product(3, "Shoes", 39.99));
            //inventory.add(new Product(4, "Hat", 49.99));
            //inventory.add(new Product(1, "Coat", 19.99));
            return inventory;
        }

        public static void listAllProducts (List < Product > productsList) {
            System.out.println(("We carry the following inventory: "));
            for (Product product : productsList) {
                System.out.println(product);
            }

        }
}


