package com.java8.Pracice.Optional;
//9. Write a method that returns Optional.
import java.util.Optional;

public class Question9 {
    static Optional<String> findname(String input){
        return (input==null || input.isEmpty())
                ?Optional.empty()//so if the input is null orepty string then Optional.empty() is called
                :Optional.of(input);//if the input has some value then Optional containg that value is created

    }

    public static void main(String[] args) {
        System.out.println(findname("Shubham").orElse("None"));
        System.out.println(findname("").orElse("None"));
    }
}
