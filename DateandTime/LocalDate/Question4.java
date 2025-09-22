package com.java8.Pracice.DateandTime.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Find the difference in days between two dates.
public class Question4 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate custom=LocalDate.of(2025,12,31);
        long daybetween= ChronoUnit.DAYS.between(today,custom);//ChronoUnit.DAYS.between(d1,d2) gives the no days present  between the d1 and s2
        System.out.println("No of days between the today and custom dates :"+daybetween);
    }
}
