package com.pluralsight.NorthwindTradersSpringBoot2.dao.impl;


import com.pluralsight.NorthwindTradersSpringBoot2.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class SimpleProductDao {
    private final List<Product> products = new ArrayList<>();

    public SimpleProductDao(){
        products.add(new Product(1, "Cheese"));
    }
    @Override
    public void add(Product product){
        product.add(product);

    }
    @Override
    public List<Product> getAll(){
        return Collections.
    }
}
