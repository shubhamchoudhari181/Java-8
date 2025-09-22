package com.java8.Pracice.Optional;

import java.util.Optional;

//Q5. Use orElse() vs orElseGet().
public class Question5 {
    public static void main(String[] args) {
       Optional<String> op=Optional.of("Shubham");
       System.out.println(op.orElse(getdefault()));
       System.out.println(op.orElseGet(()->"Hello"));

    }
    static String getdefault(){
        System.out.println("Calling Default");
        return "None";
    }
}

