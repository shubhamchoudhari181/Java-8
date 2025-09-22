package com.java8.Pracice.Stream;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

//Convert a string array into a stream and print all elements in uppercase.
public class Question2 {
    public static void main(String[] args) {
        String[] arr={"Shubham","Rupesh","Shrikant"};
         Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);
    }
}
