package com.binar.batch7.CH3_Task;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {
    private Restoran restoran;

    @BeforeEach
    void setUp() {
        restoran = new Restoran();
    }

    @Test
    void addOrder_PositiveQty_AddsToOrder() {
        Map<String, Integer> order = new HashMap<>();
        String input = "2\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        restoran.addOrder("Nasi Goreng", 15000, scanner, order);
        Assert.assertTrue(order.containsKey("Nasi Goreng"));
        assertEquals(3, order.get("Nasi Goreng"));
    }

    @Test
    void addOrder_NegativeQty_RejectsOrder() {
        Map<String, Integer> order = new HashMap<>();
        String input = "-1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        restoran.addOrder("Nasi Goreng", 15000, scanner, order);
        Assert.assertFalse(order.containsKey("Nasi Goreng"));
    }

    // Add more test cases as needed
}
