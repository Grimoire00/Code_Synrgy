package com.binar.batch7.CH3_Pertemuan4_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class tesStream {
    public static void main(String[] args) {
        Stream<String> stream4= Stream.of("riki","aldi","pari","nama teman saya");
        Stream<String> stream5= Arrays.asList("riki","aldi","pari").stream();
        stream5.forEach(System.out::println);
        stream4.forEach(System.out::println);
    }
}
