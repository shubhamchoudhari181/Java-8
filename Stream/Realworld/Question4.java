package com.java8.Pracice.Stream.Realworld;
//4. Generate the first 20 multiples of 3 using Stream.iterate().

import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        Stream.iterate(3,n->n+3).limit(20).forEach(System.out::println);
    }
}
