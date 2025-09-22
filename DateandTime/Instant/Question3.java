package com.java8.Pracice.DateandTime.Instant;

import java.time.Duration;
import java.time.Instant;

//Measure execution time of a task using Instant.
public class Question3 {
    public static void main(String[] args) {
        Instant start=Instant.now();
        long sum=0;
        for(int i=0;i<100000000;i++){
            sum+=i;
        }
        Instant end=Instant.now();
        Duration between=Duration.between(start,end);
        System.out.println("Sum is : "+sum);
        System.out.println("Time required for task"+between.toNanos());
    }
}
