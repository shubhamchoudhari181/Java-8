package com.java8.Pracice.DateandTime.LocalDateTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Format the current date-time as "dd-MM-yyyy HH:mm:ss"
public class Question2 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String formatteddate=now.format(formatter);
        System.out.println(formatteddate);
    }
}
