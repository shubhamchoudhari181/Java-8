package com.java8.Pracice.Stream.BonusChallenge;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//2. Create a stream of 100 random integers and find the average
public class Question2 {
    public static void main(String[] args) {
        OptionalDouble avg = Stream.iterate(1, n -> n + 1).limit(100).mapToInt(Integer::intValue).average();
        System.out.println(avg);
    }
}
