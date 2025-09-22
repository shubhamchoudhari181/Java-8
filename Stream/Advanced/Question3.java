package com.java8.Pracice.Stream.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//3. Given a list of numbers, find maximum and minimum using Streams
public class Question3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,11,12,13,14,15);
        Optional<Integer> max=list.stream().max(Integer::compareTo);
        Optional<Integer> min=list.stream().min(Integer::compareTo);
        System.out.println("Max element from list is"+max);
        System.out.println("Min element from list is "+min);

    }
}
