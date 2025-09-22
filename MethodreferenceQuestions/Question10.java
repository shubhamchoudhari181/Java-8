package com.java8.Pracice.MethodreferenceQuestions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Given a list of integers, use constructor reference to convert them into BigInteger objects.
//        (Hint: BigInteger::new).
public class Question10 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,12,13,145);
        Function<String, BigInteger> convert= BigInteger::new;
        //actally BigInteger have priovate constructoir so we cannot call it diectly
        for(Integer a:l)
            System.out.println(convert.apply(String.valueOf(a)));
    }

}
//        Java looks for a constructor in BigInteger that accepts Integer.
//        But constructors in BigInteger are:
//
//        BigInteger(String val)
//
//        BigInteger(byte[] val)
//
//        BigInteger(int signum, byte[] magnitude)
//
//👉 No BigInteger(Integer) constructor exists.
//        👉 BigInteger(long) does exist but is private, so you can’t use it.
