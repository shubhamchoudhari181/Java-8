package com.java8.Pracice.DateandTime.Duration;

import java.time.Duration;
import java.time.LocalTime;

//Find the duration between two LocalTime values.
public class Question1 {
    public static void main(String[] args) {
        LocalTime now=LocalTime.of(2,30);
        LocalTime now1=LocalTime.now();
        Duration between=Duration.between(now,now1);
        System.out.println("Duration between two LocalTimes is : "+between.toNanos());
    }
}
