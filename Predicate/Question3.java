package com.java8.Pracice.Predicate;
import java.util.function.Predicate;

public class Question3 {
    public static void main(String[] args) {
        Predicate<String> startswiths = x -> x.startsWith("S");
        Predicate<String> endswiths = x -> x.charAt(x.length() - 1) == 'm';
        Predicate<String> and=startswiths.and(endswiths);
//        System.out.println(and.test("Shubham"));
//        System.out.println(and.test("shubham"));
//        System.out.println(and.test("Shubha"));
        Predicate<String> or=startswiths.or(endswiths);
//        System.out.println(or.test("Shubham"));
//        System.out.println(or.test("shubham"));
//        System.out.println(or.test("Shubha"));
//        System.out.println(or.test("VRushabh"));
        Predicate<String> neglect=startswiths.negate().and(or);
        System.out.println(neglect.test("shubham"));

    }

}
