package com.pluralsight.controllers;

import com.pluralsight.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> products;

    public ProductsController(){
        products = new ArrayList<>();
        products.add(new Product(1, "Cat food",1,));

    }
    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return products;
    }
    @RequestMapping(path = "/products{productId}", method = RequestMethod.GET)
    
}

