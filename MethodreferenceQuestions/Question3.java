package com.java8.Pracice.MethodreferenceQuestions;

import java.util.function.Consumer;

//Create a class Printer with a method printMessage(String msg).
//Use a method reference to call it via Consumer<String>.
class Printer{
    public void printMessage(String msg){
        System.out.println(msg);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Printer p=new Printer();
        Consumer<String> con=p::printMessage;
        con.accept("Shubham");
    }
}
