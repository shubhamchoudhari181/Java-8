package com.java8.Pracice.Stream.Realworld;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//5. Given a list of integers, group them into even and odd using Collectors.groupingBy().
public class Question5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9)        ;
        Map<String,List<Integer>> map= list.stream().collect(Collectors.groupingBy(n->(n%2==0)?"Even":"Odd"));
        System.out.println(map);

    }
}
