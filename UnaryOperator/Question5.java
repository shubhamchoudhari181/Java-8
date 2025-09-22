package com.java8.Pracice.UnaryOperator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Use List<String> containing names → ["Shubhu", "Amit", "Ravi"].
//Sort them using Collections.sort() with method reference
public class Question5 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Shubham","Akash","Rahul");
        Collections.sort(l,String::compareTo);
        System.out.println(l);
    }
}
