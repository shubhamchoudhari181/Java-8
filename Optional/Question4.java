package com.java8.Pracice.Optional;

import java.util.Optional;

//Q4. Use ifPresent() to print a value only if it exists.
public class Question4 {
    public static void main(String[] args) {
        Optional<String> op=Optional.ofNullable(null);
        op.ifPresent(System.out::println);
    }
}
