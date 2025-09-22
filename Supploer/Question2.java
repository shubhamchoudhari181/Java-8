package com.java8.Pracice.Supploer;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Supplier;

//2.  Write a supplier to return current date and time.
public class Question2 {
    public static void main(String[] args) {
        Supplier<LocalDateTime> s=()->LocalDateTime.now();
        System.out.println(s.get());
    }
}
