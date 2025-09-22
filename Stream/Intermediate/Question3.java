package com.java8.Pracice.Stream.Intermediate;
//3. Generate the first 10 even numbers using Stream.iterate().
import java.util.stream.Stream;

//3. Generate the first 10 even numbers using Stream.iterate().
public class Question3 {
    public static void main(String[] args) {
        Stream.iterate(2,n->n+1).filter(n->n %  2==0).limit(10).forEach(System.out::println);
    }
}
