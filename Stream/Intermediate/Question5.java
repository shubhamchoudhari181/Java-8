package com.java8.Pracice.Stream.Intermediate;

import java.util.stream.Stream;

//5. Use Stream.generate(Math::random) to print 5 random numbers
public class Question5 {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
