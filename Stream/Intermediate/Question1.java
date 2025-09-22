package com.java8.Pracice.Stream.Intermediate;

import java.util.Arrays;
import java.util.List;

//1. Given a list: [1,2,3,4,5,2,3,4,5], remove duplicates using distinct() and print.
public class Question1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,2,3,4,5);
        list.stream().distinct().forEach(System.out::println);
            }
}
