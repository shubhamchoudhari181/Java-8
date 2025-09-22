package com.java8.Pracice.DateandTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//Convert LocalDateTime.now() into a ZonedDateTime.
public class Question2 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println("LocalDateTime of now"+now);

        ZonedDateTime znow=now.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("The LocalDateTime in ZonedDateTime is:"+znow);
    }
}
//LocalDateTime.now() → gives the current date-time without any time zone.
//
// atZone(ZoneId.of("Asia/Kolkata")) → attaches the specified time zone, converting it to a ZonedDateTime.
