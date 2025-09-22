package com.java8.Pracice.UnaryOperator;

import java.util.function.UnaryOperator;

//1.  Write a UnaryOperator to square a number.
public class Question1 {

    public static void main(String[] args) {
        UnaryOperator<Integer> sqr=x->x*x;
        System.out.println(sqr.apply(10));
    }
}
