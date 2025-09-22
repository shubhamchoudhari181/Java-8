package com.java8.Pracice.BiFunction;

import java.util.function.BiFunction;

public class Question2 {
    public static void main(String[] args) {
        Product p1=new Product("Pen",10);
        Product p2=new Product("Book",50);
        Product p3=new Product("Scale",20);
        BiFunction<Double,Double,Double> taxcalculator=(a,b)->{
            double tax=a*(b/100);
            double totalprice=tax+a;
            return totalprice;
        };
        System.out.println(taxcalculator.apply(50.0,4.0));

    }
}
class Product{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

