package com.java8.Pracice.Stream.Intermediate;

import java.util.Arrays;
import java.util.List;

//2. From a list of names, filter those starting with "A", convert to uppercase, and print sorted.
public class Question2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("shubham","Akash","Ankita","Shrikant");
        names.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
