package com.java8.Pracice.BiFunction;

import java.util.function.BiFunction;

//Create a BiFunction<Integer, Integer, String> that takes marks in two subjects and returns "Pass" if
// average ≥ 50, else "Fail".
public class Question4 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> res=(a,b)-> {
            int avg = (a + b) / 2;
            if(avg>50){
                return "pass";
            }
            else{
                return "Fail";
            }
        };
        System.out.println(res.apply(60,50));
    }

}
