package com.java8.Pracice.StreamP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5,6);
//        List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(evenList);
//        List<Integer> mappedList=evenList.stream().map(n->n/2).collect(Collectors.toList());
//        System.out.println(mappedList);
//        List<Integer> nList=list.stream().filter(n->n%2==0)//filter uses predicte to check the condition
//                .map(x->x/2)//map uses rthe function  to change tyhe value
//                .distinct()//it removes duplicats
//                .sorted((a,b)->b.compareTo(a))//sorts the element
//                .limit(4)//it give th strating element of result by specified no
//                .skip(1)//it removes the1 elemnt from starting
//                .toList();
//        System.out.println(nList);

        List<Integer> l= Stream.iterate(0,x->x+1)
                .limit(101)
                .filter(n->n%2==0)
                .map(x->x/10)
                .sorted((a,b)->b.compareTo(a))
                .distinct()
                .toList();
        System.out.println(l);
    }
}
