package com.kodoj.restaurant.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String helloOnMainPage() {
        return "Good day to you, customer!";
    }
}
