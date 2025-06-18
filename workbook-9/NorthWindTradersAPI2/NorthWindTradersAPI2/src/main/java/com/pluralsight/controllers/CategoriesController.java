package com.pluralsight.controllers;

import com.pluralsight.models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    private List<Category> categories;

    public CategoriesController(){
        categories = new ArrayList<>();
        categories.add(new Category(1, "cat"));
        categories.add(new Category(2, "dog"));
        categories.add(new Category(3, "hamster"));
        categories.add(new Category(4, "rat"));
        categories.add(new Category(5, "cat"));

    }
    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categories
    }
    @RequestMapping (path = "/categories/{categoryId}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable int categoryId){
        for (Category category : categories){

        }
    }


}
