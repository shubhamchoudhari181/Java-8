package com.java8.Pracice.Stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. From a list of integers, divide each number by 2 using map() and collect into a new list
public class Question4 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,60,70,80,90);
        List<Integer> newList=list.stream().map(n->n/2).collect(Collectors.toList());
        System.out.println(newList);

    }
}
