package com.java8.Pracice.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Create a stream from a list of integers and print only even numbers.
public class Question1 {
    public static void main(String[] args) {
        List<Integer> list= Stream.iterate(1,n->n+1).limit(100).filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);
    }


}
