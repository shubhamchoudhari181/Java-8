package com.java8.Pracice.Stream;
//Create a stream using Stream.of() with 5 city names, and sort them alphabetically
import java.util.stream.Stream;

public class Question3 {
    public static void main(String[] args) {
        Stream.of("Pune","Mumabai","panvel","Nashik").sorted().forEach(System.out::println);
    }
}
