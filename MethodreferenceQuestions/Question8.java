package com.java8.Pracice.MethodreferenceQuestions;

import java.util.Date;
import java.util.function.Supplier;

//Use Supplier<Date> with constructor reference Date::new to print the current date.
public class Question8 {
    public static void main(String[] args) {
        Supplier<Date> date=Date::new;
        System.out.println(date.get());

    }
}
