package com.java8.Pracice.Supploer;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question5 {
    public static void main(String[] args) {
        Supplier<Integer>  randomSupplier=()->new Random().nextInt(100)+1;
        List<Integer> randomNumbers= Stream.generate(randomSupplier).limit(10).collect(Collectors.toList());
        System.out.println("Random Numbers"+randomNumbers);
    }
}
