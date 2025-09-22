package com.java8.Pracice.Optional;

import java.util.Optional;

//Q3. Check if an Optional contains a value
public class Question3 {
    public static void main(String[] args) {
        Optional<String> op=Optional.of("Shubham");
        System.out.println(op.isPresent());
        op.ifPresent(v->System.out.println(v));

    }
}
