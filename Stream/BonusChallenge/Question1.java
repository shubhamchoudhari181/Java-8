package com.java8.Pracice.Stream.BonusChallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//1. Reverse sort a list of integers and take the top 3 elements
public class Question1 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,12,45,6,4,0);
        list.stream().sorted((a,b)->b.compareTo(a)).limit(3).forEach(System.out::println);

    }
}
