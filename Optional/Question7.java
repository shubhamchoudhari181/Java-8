package com.java8.Pracice.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Spliterator;

public class Question7 {
    public static void main(String[] args) {
        Optional<String> op= Optional.of("Shubham");
        Optional<Integer> len=op.flatMap(v->Optional.of(v.length()));
        System.out.println(len);

        //flatmap is same as map but it avoids nested struyctres like e.g
        Optional<Optional<Integer>> len1=op.map(v->Optional.of(v.length()));
        System.out.println(len1 );
//        map() → expects you to return a plain type (like Integer). If you return an Optional, you’ll get a type inference error.

//        flatMap() → designed for when your function already returns an Optional. It flattens the result.


    }
}
