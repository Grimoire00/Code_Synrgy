package com.binar.batch7.CH3_Pertemuan4_Stream.Task;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Memeriksa apakah ada angka ganjil dalam stream
        boolean anyOdd = numbers.stream().anyMatch(num -> num % 2 != 0);
        System.out.println("Apakah ada angka ganjil? " + anyOdd); // Output: false

        // Memeriksa apakah ada angka yang lebih besar dari 5 dalam stream
        boolean anyGreaterThanFive = numbers.stream().anyMatch(num -> num > 5);
        System.out.println("Apakah ada angka yang lebih besar dari 5? " + anyGreaterThanFive); // Output: true
    }
}
