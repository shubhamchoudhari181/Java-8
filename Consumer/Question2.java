package com.java8.Pracice.Consumer;
//2.  Write a consumer to convert string to uppercase and print it.
import java.util.function.Consumer;

public class Question2 {
    public static void main(String[] args) {
        Consumer<String> toUpper=x-> System.out.println(x.toUpperCase());
        toUpper.accept("Shubham");
    }
}
