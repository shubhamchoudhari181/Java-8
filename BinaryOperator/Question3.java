//package com.java8.Pracice.BinaryOperator;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.BinaryOperator;
//
////3.  Reduce a list of integers to their sum using BinaryOperator.
//public class Question3 {
//    public static void main(String[] args) {
//        List<Integer> l= Arrays.asList(10,11,12,13,14,15);
//        BinaryOperator<List<Integer> red =x ->{
//            int sum=0
//            for (Integer e : x) {
//                sum += e;
//            }
//            for(Integer e:x){
//                e-=sum;
//            }
//            return x;
//        };
//        System.out.println(red.apply(l));
//    }
//}
