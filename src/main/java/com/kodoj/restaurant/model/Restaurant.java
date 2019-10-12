package com.kodoj.restaurant.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Restaurant {

    String restaurantName;
    String restaurantCity;
    int restaurantNumber;
    List<Table> tables;

    public Restaurant(String restaurantName, String restaurantCity, int restaurantNumber) {
        this.restaurantName = restaurantName;
        this.restaurantCity = restaurantCity;
        this.restaurantNumber = restaurantNumber;
        tables = new ArrayList<>();
    }
}
