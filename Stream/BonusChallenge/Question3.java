package com.java8.Pracice.Stream.BonusChallenge;
//3. From a list of strings, find the longest word using Streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Shubham","raj","Shri");
        Optional<String> longest=list.stream().max((a,b)->(Integer.compare(a.length(),b.length())));
        System.out.println("Longest word from a string is :"+longest);
    }
}
