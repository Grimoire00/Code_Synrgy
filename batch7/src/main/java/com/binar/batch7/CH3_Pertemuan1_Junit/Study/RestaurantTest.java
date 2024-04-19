package com.binar.batch7.CH3_Pertemuan1_Junit.Study;

import org.junit.Assert;
import org.junit.Test;

public class RestaurantTest {
    @Test
    public void testCalculateTotalPriceForSingleFoodItem() {
        Restaurant restaurant = new Restaurant();
        restaurant.orderFood("Nasi Goreng", 25000.0); // Memesan satu jenis makanan
        System.out.println(restaurant.calculateTotalPrice());
        Assert.assertEquals(25000.0, restaurant.calculateTotalPrice(),0.5); // Memastikan harga yang dihitung benar
    }
}
