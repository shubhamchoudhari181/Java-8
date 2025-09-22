package com.java8.Pracice.Optional;

import java.util.Optional;

//Q1. Create an Optional with a non-null value and print it.
public class Question1 {
    public static void main(String[] args) {
        Optional<String> op=Optional.of("Shubham");
        System.out.println(op.get());

    }
}
