package com.java8.Pracice.DateandTime.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Parse a string like "2025-12-31 23:59:59" into LocalDateTime
public class Question3 {
    public static void main(String[] args) {
        String date="2025-12-31 23:59:59";
        DateTimeFormatter formatteddate=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime custom=LocalDateTime.parse(date,formatteddate);
        System.out.println(custom);
    }
}
