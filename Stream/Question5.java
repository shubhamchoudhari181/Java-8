package com.java8.Pracice.Stream;

import java.util.stream.Stream;

//5. Create an empty stream and verify that its count is 0
public class Question5 {
    public static void main(String[] args) {
        Stream<String> s=Stream.empty();
        long count=s.count();
        System.out.println("Count of Empty Stream is:"+count);
    }
}
