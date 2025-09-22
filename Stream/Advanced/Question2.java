package com.java8.Pracice.Stream.Advanced;
//2. From a list of words, collect unique words into a Set.

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Shubham","Shrikant","Shubham","raj");
        Set<String> uniq=names.stream().collect(Collectors.toSet());
        System.out.println(uniq);
    }
}
