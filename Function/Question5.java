package com.java8.Pracice.Function;

import java.util.function.Function;

//5.  Create a function that extracts domain name from an email address
public class Question5 {
    public static void main(String[] args) {
        Function<String,String> edoamin=x->{
            int index=x.indexOf('@');
            return x.substring(index);
        };
        System.out.println(edoamin.apply("shubham.choudharI@gmail.com"));
        System.out.println(edoamin.apply("shubham.choudharI@sinhgad.edu"));
    }
}
