package com.java8.Pracice.DateandTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Extract only date and only time from a LocalDateTime.
public class Question4 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        LocalDate date=now.toLocalDate();
        LocalTime time=now.toLocalTime();
        System.out.println("Time is : "+time);
        System.out.println("Date is : "+date);
    }
}
