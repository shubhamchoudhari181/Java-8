package com.java8.Pracice.BiPredicate;
//1.  Write a BiPredicate to check if sum of two numbers is even
import java.util.function.BiPredicate;

public class Question1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isEven=(x,y)->(x+y)%2==0;
        System.out.println(isEven.test(10,1));
    }
}
