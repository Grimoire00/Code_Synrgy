package com.binar.batch7.CH3_Pertemuan1_Junit.Study;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> orders = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

    public void orderFood(String foodName, double price) {
        orders.add(foodName);
        prices.add(price);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}
