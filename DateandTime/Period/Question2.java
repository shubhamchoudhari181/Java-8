package com.java8.Pracice.DateandTime.Period;

import java.time.LocalDate;
import java.time.Period;

//Add 6 months to a LocalDate using Period.
public class Question2 {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
       LocalDate up=now.plus(Period.ofMonths(6));
        System.out.println(up);
    }
}
//Period.ofMonths(6) → creates a period of 6 months.
//LocalDate.plus(Temporal Value)->`
//date.plus(period) → adds the period to the date.
