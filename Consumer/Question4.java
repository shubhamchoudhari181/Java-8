package com.java8.Pracice.Consumer;

import java.lang.invoke.ConstantCallSite;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//4.  Write a consumer that updates the price of all products in a list by 10%.
public class Question4 {
    public static void main(String[] args) {
        Product p1=new Product("Car",20000.0);
        Product p2=new Product("Bike",2000.0);
        Product p3=new Product("Cycle",200.0);
        List<Product> prices= Arrays.asList(p1,p2,p3);
        Consumer<Product> increse= li->{
            Double getPrice=li.getP_price()+(li.getP_price()*10)/100;
            li.setP_price(getPrice);

        };
        for(Product P:prices){
            increse.accept(P);
        }
        System.out.println(prices);
    }
}
class Product{
    private String p_name;
    private Double p_price;

    public Product(String p_name, Double p_price) {
        this.p_name = p_name;
        this.p_price = p_price;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Double getP_price() {
        return p_price;
    }

    public void setP_price(Double p_price) {
        this.p_price = p_price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "p_name='" + p_name + '\'' +
                ", p_price=" + p_price +
                '}';
    }
}

