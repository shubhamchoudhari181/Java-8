package com.java8.Pracice.MethodreferenceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Write a static method isEven(int n) and use it with Predicate<Integer> to filter even numbers from a
// list.
class Eg{
    public static boolean isEven(int i){
      return i%2==0;
    }
}
public class Question2 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,11,12,13,14);
        Predicate<Integer> a=Eg::isEven;
        for(Integer e:l) {
            if (a.test(e)) {
                System.out.println(e);
            }
        }
    }
}
