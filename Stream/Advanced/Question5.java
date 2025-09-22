package com.java8.Pracice.Stream.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//5. Use anyMatch(), allMatch(), noneMatch() to check conditions in a list (e.g., all numbers
//positive?).
public class Question5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,-1,-2,-3,0);
        boolean anyelementpositive=list.stream().anyMatch(n->n>0);
        System.out.println(anyelementpositive);
        boolean allelementpositive=list.stream().allMatch(n->n>0);
        System.out.println(allelementpositive);
        boolean nonematch=list.stream().noneMatch(n->n>10);
        System.out.println(nonematch);
        Optional<Integer> findfirst=list.stream().findFirst();
        System.out.println(findfirst);


    }
}
