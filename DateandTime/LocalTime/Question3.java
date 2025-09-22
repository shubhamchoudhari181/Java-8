package com.java8.Pracice.DateandTime.LocalTime;

import java.time.LocalTime;

//Compare two times and find which is earlier.
public class Question3 {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        LocalTime custom=LocalTime.of(3,50);
        System.out.println("Now is after custom:"+now.isAfter(custom));
        System.out.println("Now is before custom:"+now.isBefore(custom));
    }
}
