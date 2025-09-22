package com.java8.Pracice.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//Use BinaryOperator to find the employee with the highest salary from a list.
public class Question5 {
    public static void main(String[] args) {
        Emp e1=new Emp("Shubham",500000);
        Emp e2=new Emp("Shyam",50000);
        Emp e3=new Emp("Raj",5000);
        List<Emp> l= Arrays.asList(e1,e2,e3);
        BinaryOperator<Emp> maxsal=(x,y)->x.getSal()>y.getSal()?x:y;
        Emp high=l.get(0);
        for(Emp e: l){
            high=maxsal.apply(high,e);
        }
        System.out.println("Employee with highest salary:"+high);
    }
}
class Emp{
    private String name;
    private Integer sal;

    public Emp(String name, Integer sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
