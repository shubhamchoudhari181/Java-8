package com.java8.Pracice.Stream;
//4. Use IntStream.range(1, 11) to print squares of numbers from 1 to 10.
import java.util.stream.IntStream;

public class Question4 {
    public static void main(String[] args) {
        IntStream.range(1,11).map(x->x*x).forEach(System.out::println);
    }
}
