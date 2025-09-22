package com.java8.Pracice.Stream.Realworld;
//3. Given a list of products (with name and price), filter products with price > 1000 and collect their
//names into a list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        Product p1=new Product("Pentanium",100000);
        Product p2=new Product("Pencil Set",700);
        Product p3=new Product("Scalable Model",5000);
        List<Product> list= Arrays.asList(p1,p2,p3);
        List<Product> newList=list.stream().filter(n->n.getPrice()>1000).collect(Collectors.toList());
        System.out.println(newList);
    }
}
class Product{
    private String name;
    private Integer Price;

    public Product(String name, Integer price) {
        this.name = name;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
