package com.pluralsight.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String home(@RequestParam(required = false) String country) {
        if (country != null) {
            return "Hello from " + country + "!";
        }
        return "Hello World!";
    }
}