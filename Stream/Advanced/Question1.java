package com.java8.Pracice.Stream.Advanced;

import java.util.Arrays;
import java.util.List;

//1. Given a list of integers, find the sum of all even numbers using reduce().
public class Question1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,1,3);
        int sum=list.stream().filter(n->n%2==0).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
