package com.java8.Pracice.DateandTime.Period;

import java.time.LocalDate;
import java.time.Period;

//Find the period (years, months, days) between two LocalDate values.
public class Question1 {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalDate custom=LocalDate.of(2026,9,30);
        Period between=Period.between(now,custom);
        long years= between.getYears();
        long months= between.getMonths()%12;
        long days=between.getDays()%30;
        System.out.println("The Period between two between Two LocalDates :"+days+" "+months+" "+years);
    }
}
