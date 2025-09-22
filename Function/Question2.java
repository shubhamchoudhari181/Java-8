package com.java8.Pracice.Function;

import java.util.function.Function;

public class Question2 {
    public static void main(String[] args) {
        Function<Double,Double> degtofreh=x-> {
            return (x * 9 / 5) + 32;
        };
        System.out.println("IN frehnite"+degtofreh.apply(3.2));
    }
}
