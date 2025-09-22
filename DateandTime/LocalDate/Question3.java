package com.java8.Pracice.DateandTime.LocalDate;

import java.time.LocalDate;

//Add 100 days to today’s date.
public class Question3 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today.plusDays(100));
    }
}
