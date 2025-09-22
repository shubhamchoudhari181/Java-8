package com.java8.Pracice.Stream.Advanced;

import java.util.Arrays;
import java.util.List;

//4. Count how many numbers in a list are greater than 50 using count().
public class Question4 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,60,40,90,80);
        long count=list.stream().filter(n->n>50).count();
        System.out.println("The total no of elements which is greater than 50 is:"+count);
    }
}
