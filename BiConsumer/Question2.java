package com.java8.Pracice.BiConsumer;

import java.util.function.BiConsumer;

//2.  Write a BiConsumer to concatenate and print two strings.
public class Question2 {
    public static void main(String[] args) {
        BiConsumer<String,String> concat=(a,b)->{
            System.out.println(a+b);
        };
        concat.accept("Shubham","Chaudhari");

    }
}
