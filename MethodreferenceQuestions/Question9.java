package com.java8.Pracice.MethodreferenceQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Make a class Book with (String title) constructor.
//Use Function<String, Book> to create books from a list of titles.
class Book{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
public class Question9 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Mathematics","Rich Dad Poor Dad","Bhagwadgeeta");
        Function<String,Book> create= Book::new;
        for(String name:l){
            System.out.println(create.apply(name));
        }
    }
}
