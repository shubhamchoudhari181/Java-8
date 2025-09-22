package com.java8.Pracice.Stream.Realworld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//1. Given a list of employee names → sort them by length.
public class Question1 {
    public static void main(String[] args) {
        List<String> emp= Arrays.asList("Shubham","Shrikant","Rupesh","Manish");
        emp.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
        emp.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).forEach(System.out::println);
    }
}
