package com.java8.Pracice.Predicate;
//4.  Filter a list of integers to get only even numbers using Predicate
//here we solved this questiom by very simple method becoase still we not learned about stream API
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(10,11,23,12,2,23);
        Predicate<Integer> isEven= x->x%2==0;
        for(Integer i:arr){
            if(isEven.test(i)){
                System.out.println(i);
            }
        }
    }
}
