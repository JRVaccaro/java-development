package com.pluralsight.NorthwindTradersSpringBoot2.dao.impl;

import com.pluralsight.NorthwindTradersSpringBoot2.models.Product;

import java.util.List;

public interface ProductDao {
    void add (Product product)
        List<Product> getAll();
}
