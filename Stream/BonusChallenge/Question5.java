package com.java8.Pracice.Stream.BonusChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5. Implement a small word frequency counter: given a list of words, use Streams +
//        Collectors.groupingBy() to count how many times each word appears.
public class Question5 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Shubham","Shrikant","Shubham","SHrikant","Ravi","Shubham");
        Map<String,Long> count=names.stream().collect(Collectors.groupingBy((a )->a,Collectors.counting()));
        System.out.println(count);}
}
