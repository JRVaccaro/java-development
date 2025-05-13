package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House mansion = new House("Big fancy house", "2025,05,13", 100000, "124 Big Spender St",
                1, 5000, 5000);

        assets.add(mansion);

        for (Asset asset : assets){
            System.out.println(asset.getDescription() + asset.getValue());
        }
    }
}
