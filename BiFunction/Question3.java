package com.java8.Pracice.BiFunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Question3 {
    public static void main(String[] args) {
//        Given two lists — one containing keys (Strings) and the other containing values (Integers) — use
//        BiFunction<List<String>, List<Integer>, Map<String, Integer>> to merge them into a map.
        List<String> l1= Arrays.asList("Pen","Pecil","Book");
        List<Integer> l2=Arrays.asList(10,30,50);

        BiFunction<List<String>,List<Integer>, Map<String,Integer>> cmap=(a, b)->{
            HashMap<String,Integer> map=new HashMap<>();
            for(int i=0;i<a.size() && i<b.size() ;i++){
                map.put(a.get(i),b.get(i));
            }
            return map;
        };
        System.out.println(cmap.apply(l1,l2));
    }
}
