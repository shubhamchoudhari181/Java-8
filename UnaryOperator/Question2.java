package com.java8.Pracice.UnaryOperator;
//2.  Write a UnaryOperator to reverse a string
import java.util.function.UnaryOperator;

public class Question2 {
    public static void main(String[] args) {
        UnaryOperator<String> s=x->  new StringBuffer(x).reverse().toString();
        System.out.println(s.apply("Shubham"));

    }
}
