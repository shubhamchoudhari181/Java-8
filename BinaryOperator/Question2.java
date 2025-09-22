package com.java8.Pracice.BinaryOperator;

import java.util.function.BinaryOperator;

//2.  Write a BinaryOperator to find the maximum of two numbers.
public class Question2 {
    public static void main(String[] args) {
        BinaryOperator<Integer> max=(x,y) ->{
            if(x>y){
                return x;
            }
            else{
                return y;
            }
        };
        System.out.println(max.apply(10,2));
    }
}
