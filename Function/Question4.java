package com.java8.Pracice.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question4 {
    public static void main(String[] args) {
        List<String> s= Arrays.asList("Shubham","Akash","Rup");
        Function<String,Integer> n=x-> x.length();
        for(String sl:s){
            System.out.println(n.apply(sl));
        }

    }
}
