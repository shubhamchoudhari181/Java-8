package com.java8.Pracice.Optional;

import java.util.Optional;

//Q6. Use map() to transform the valu
public class Question6 {
    public static void main(String[] args) {
        Optional<String> op=Optional.of("shubhma");
        Optional<String> Upper=op.map(String::toUpperCase);
        System.out.println(Upper.get());

    }
}
