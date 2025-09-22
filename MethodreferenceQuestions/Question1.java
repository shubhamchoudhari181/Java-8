package com.java8.Pracice.MethodreferenceQuestions;

import com.java8.Main;

import java.util.function.Function;

//Create a class MathUtils with a static method square(int n).
//Use Function<Integer, Integer> with method reference to square a number.
class MathUtils{
    public static int Square(int x){
        return x*x;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Function<Integer,Integer>  a=MathUtils::Square;
        System.out.println(a.apply(10));
    }
}
