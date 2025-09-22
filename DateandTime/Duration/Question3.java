package com.java8.Pracice.DateandTime.Duration;

import java.time.Duration;

public class Question3 {
    public static void main(String[] args) {
        Duration d1=Duration.ofHours(2).plusMinutes(5);
        long hours=d1.toHours();
        long minutes=d1.toMinutes()%60;
        System.out.println("Hours is : "+hours +"Minutes : "+minutes);
    }
}
