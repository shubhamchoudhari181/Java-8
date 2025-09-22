package com.java8.Pracice.DateandTime.LocalDate;

import java.time.LocalDate;

//Check if the current year is a leap yea
public class Question2 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("Is current year is leap year ? "+today.isLeapYear());
    }
}
