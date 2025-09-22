package com.java8.Pracice.BinaryOperator;
//1.  Write a BinaryOperator to add two integers.
import java.util.function.BinaryOperator;

public class Question1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add=(x,y)-> x+y;
        System.out.println(add.apply(10,22));
    }
}
