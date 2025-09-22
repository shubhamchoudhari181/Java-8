package com.java8.Pracice.UnaryOperator;

import java.util.function.Function;
import java.util.function.Supplier;

//Suppose you have a String message = "hello world".
//        Use method reference to convert it to upper case by calling message::toUpperCase.
public class Question4 {
    public static void main(String[] args) {
        String msg="Shubham";
        Supplier<String> supplier = msg::toUpperCase;
        System.out.println(supplier.get());
    }
}
