package com.java8.Pracice.BinaryOperator;

import java.util.function.BinaryOperator;

//4.  Concatenate two strings using BinaryOperator.
public class Question4 {
    public static void main(String[] args) {
        BinaryOperator<String> concat=(x,y)-> x+y;
        System.out.println(concat.apply("Shubh","am"));
    }
}
