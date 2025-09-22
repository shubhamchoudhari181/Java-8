package com.java8.Pracice.Function;

import java.util.function.Function;

public class Question3 {
    public static void main(String[] args) {
        Function<Integer,Integer> square=x->x*x;
        Function<Integer,Integer> doub=x->x*2;
        System.out.println("Output by andThen() method"+square.andThen(doub).apply(10));
        System.out.println("Outpur by compose() methos"+square.compose(doub).apply(10));
    }
}
