package com.java8.Pracice.Consumer;

import java.lang.module.Configuration;
import java.util.function.Consumer;

public class Question3 {
    public static void main(String[] args) {
        Consumer<String> s=x-> System.out.println(x);
        Consumer<String> s2= x->System.out.println(x.length());
        Consumer<String> combined=s.andThen(s2);
        combined.accept("Shubham");
    }
}
