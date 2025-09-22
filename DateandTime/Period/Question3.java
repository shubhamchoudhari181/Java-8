package com.java8.Pracice.DateandTime.Period;

import java.time.Period;

//Print only the number of days in a Period.
public class Question3 {
    public static void main(String[] args) {
        Period p=Period.of(2024,12,12);
        long days=p.getDays();
        System.out.println("The no of days presset in above Period : "+days);
    }
}
