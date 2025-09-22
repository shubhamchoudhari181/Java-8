package com.java8.Pracice.BiPredicate;

import java.util.function.BiPredicate;

//2.  Check if one string is a prefix of another using BiPredicate.
public class Question2 {
    public static void main(String[] args) {
        BiPredicate<String,String> s=(x,y)->
            x.startsWith(y);
        System.out.println(s.test("Shrikant","Shri"));

    }
}
