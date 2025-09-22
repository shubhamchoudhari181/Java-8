package com.java8.Pracice.BiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

//5.  Filter pairs from two lists where the first number is divisible by the second.
public class Question5 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10,20,30,40,50);
        List<Integer> l2=Arrays.asList(2,4,5,6,20,12);
        BiPredicate<Integer,Integer> isDivisible=(x,y)->y!=0 && x%y==0;
        for(Integer a:l1){
            for(Integer b:l2){
                if(isDivisible.test(a,b)){
                    System.out.println(a+" ."+b);
                }
            }
        }
    }
}
