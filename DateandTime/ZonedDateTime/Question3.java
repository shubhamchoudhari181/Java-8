package com.java8.Pracice.DateandTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Question3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss z");

        ZonedDateTime custom = ZonedDateTime.of(2025, 8, 28, 14, 30, 30, 0, ZoneId.of("America/New_York"));
        System.out.println(custom.format(formatter));
    }//this code i not understood sa i will definately learn
}
