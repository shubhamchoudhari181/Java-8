package com.java8.Pracice.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Q8. Use filter() to apply a condition.
public class Question8 {
    public static void main(String[] args) {
        String name=null;
        Optional<String> op=Optional.ofNullable(name);
        Optional<String> fil=op.filter(v->v.startsWith("d"));
        System.out.println(fil.orElse("none"));


    }
}
