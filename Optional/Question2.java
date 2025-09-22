package com.java8.Pracice.Optional;

import java.util.Optional;

//Q2. Create an Optional that may be null and safely print it
public class Question2 {
    public static void main(String[] args) {
        String name=null;
        Optional<String> op=Optional.ofNullable(name);
        System.out.println(op.orElse("De"));
    }
}
