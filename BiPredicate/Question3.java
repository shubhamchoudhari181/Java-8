package com.java8.Pracice.BiPredicate;

import java.util.function.BiPredicate;

//3.  Write a BiPredicate to validate login with username and password.
public class Question3 {
    public static void main(String[] args) {
        BiPredicate<String,String> validate=(x,y)->x.equals("Shubham") && y.equals("shuh123");
        System.out.println(validate.test("Shubham","shuh123"));
        System.out.println(validate.test("shubham","shuh123"));
        System.out.println(validate.test("Shubham","shubh123"));
    }
}
