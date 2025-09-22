package com.java8.Pracice.Predicate;

import java.util.function.Predicate;

//1.  Write a predicate to check if a number is even
public class Question1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven=x->x%2==0;

//        2.  Write a predicate to test if a string is empty or null.
        //here we need to create predicate that returns true when string is empty or null or both
        Predicate<String> isNullorEmpty =x->x==null||x.isEmpty();
        System.out.println(isNullorEmpty.test(null));
        System.out.println(isNullorEmpty.test(""));
        System.out.println(isNullorEmpty.test("Shubham"));
    }
}
