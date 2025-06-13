package com.pluralsight.NorthwindTradersSpringBoot2.models;

public class Product {
    private int productId;
    private String name;
    private String catergoy;
    private double price;

    public Product() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCatergoy() {
        return catergoy;
    }

    public void setCatergoy(String catergoy) {
        this.catergoy = catergoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
