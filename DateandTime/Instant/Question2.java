package com.java8.Pracice.DateandTime.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//Convert Instant.now() into ZonedDateTime (Asia/Kolkata).
public class Question2 {
    public static void main(String[] args) {
        Instant now=Instant.now();
        ZonedDateTime znow=now.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(znow);

    }
}
