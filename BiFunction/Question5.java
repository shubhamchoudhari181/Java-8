package com.java8.Pracice.BiFunction;
//Use BiFunction<Integer, Integer, Integer> to sum two integers, then use .andThen() to square the result.
import java.util.function.BiFunction;
import java.util.function.Function;

public class Question5 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bf=(a,b)->{
            return a+b;
        };
        Function<Integer,Integer> sq=a->a*a;
        BiFunction<Integer,Integer,Integer> andthen=bf.andThen(sq);
        System.out.println(andthen.apply(10,2));


    }
}
