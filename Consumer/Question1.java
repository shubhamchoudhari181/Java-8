package com.java8.Pracice.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//1.  Write a consumer to print each element of a list.
public class Question1 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Shubham","Saurabh","Gaurav");
        Consumer<String> cons=x-> System.out.println(x);
        for(String s:l){
            cons.accept(s);
        }

    }
}
