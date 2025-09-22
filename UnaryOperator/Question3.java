package com.java8.Pracice.UnaryOperator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

//3.  Apply UnaryOperator on each element of a list to double the value.
public class Question3 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,11,12,13,15);
        UnaryOperator<List<Integer>> doubleit=x->{
            for(Integer i : l){
                i=i*2;

            }
            return l;
        };

    }
}
