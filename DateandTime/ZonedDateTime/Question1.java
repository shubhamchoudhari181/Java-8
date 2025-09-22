package com.java8.Pracice.DateandTime.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Print the current date-time in Asia/Kolkata and New_York zones.
public class Question1 {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println("Current normal time : "+now);
        ZonedDateTime now1=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New_York zone :"+now1);
    }
}
