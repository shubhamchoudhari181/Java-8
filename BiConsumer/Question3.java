package com.java8.Pracice.BiConsumer;

import java.util.HashMap;
import java.util.function.BiConsumer;
//3.  Write a BiConsumer to add a key-value pair to a map.
public class Question3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        BiConsumer<String,Integer> put=(a,b)->{
            map.put(a,b);
        };
        put.accept("Shubham",10);
        System.out.println(map);

    }
}
