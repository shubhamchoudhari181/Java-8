package com.java8.Pracice.Supploer;
//1.  Write a supplier to return a random number
import java.util.function.Supplier;

public class Question1 {
    public static void main(String[] args) {
        Supplier<Double> s=()->Math.random();
        System.out.println(s.get());
    }
}
