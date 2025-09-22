package com.java8.Pracice.DateandTime.Duration;

import java.time.Duration;
import java.time.LocalDateTime;

//Print the duration between two LocalDateTime values in hours/minutes.
public class Question2 {
    public static void main(String[] args) {
        LocalDateTime t1=LocalDateTime.of(2025,8,28,18,40,30);
        LocalDateTime t2=LocalDateTime.now();
        Duration between = Duration.between(t1,t2);
        long hours=between.toHours();
        long minutes=between.toMinutes()%60;
        System.out.println("Hours : "+hours +" Minutes :"+minutes);
    }
}
