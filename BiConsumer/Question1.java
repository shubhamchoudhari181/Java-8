package com.java8.Pracice.BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
//1.  Write a BiConsumer to print key-value pairs of a map.
public class Question1 {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("Shubham",10);
        m.put("Shrikant",62);
        m.put("Borude",9);
        System.out.println(m);
        BiConsumer<String,Integer> pr=(a,b)->{
            System.out.println("Key is "+a + ", Value is "+ b);
        };
        for(Map.Entry<String,Integer> e:m.entrySet()){
            pr.accept(e.getKey(),e.getValue());
        }


    }
}
