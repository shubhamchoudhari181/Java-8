package com.java8.Pracice.Stream.BonusChallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//4. Create a stream pipeline that:
//        - Filters numbers divisible by 5
//        - Removes duplicates
//- Sorts descending
//- Skips the first 2
//        - Prints the next 3
public class Question4 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,11,12,13,13,50,30,40,77,66,44,20,90,100,60,80);
        list.stream().filter(n->n%5==0).distinct().sorted(Comparator.reverseOrder()).skip(2).limit(3).forEach(System.out::println);
    }
}
