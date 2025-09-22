package com.java8.Pracice.DateandTime.LocalTime;

import java.time.LocalTime;

//Add 2 hours and 30 minutes to the current time.
public class Question2 {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        LocalTime now1=now.plusHours(2);
        LocalTime now2=now1.plusMinutes(30);
        System.out.println("The time after adding the 2 hous 30 minutes : "+now2);
    }
}
