package com.java8.Pracice.Function;

import java.util.function.Function;

public class Question1 {
    public static void main(String[] args) {
        Function<String,Integer> slen=x->x.length();
        System.out.println(slen.apply("Shubham"));

    }
}
