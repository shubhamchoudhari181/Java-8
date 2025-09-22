package com.java8.Pracice.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Q10. Find the length of a word using Optional safely.
public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<Integer>a=list.stream();
        Stream<Integer> integerStream = a.filter(x -> x % 2 == 0).map(x->x*x)=;
        a.forEach(System.out::println);
//        Stream<Integer> integerStream = list.stream()
//                .map(x -> x * x);
//        Optional<Stream<Integer>> integerStream1 = Optional.ofNullable(integerStream);
//        integerStream1.
//        list1.forEach(System.out::println);
//        String name=null;
//       Optional<String> o=Optional.of(name);
//        int len=o.map(a->a.length()).orElse(12);
//        System.out.println(len);
    }
}
