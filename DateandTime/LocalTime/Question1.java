package com.java8.Pracice.DateandTime.LocalTime;

import java.time.LocalTime;

//Print the current time.
public class Question1 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current time of System : "+now);
    }
}
