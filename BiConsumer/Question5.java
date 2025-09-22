package com.java8.Pracice.BiConsumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

//5.  Chain BiConsumers to first print and then log the details of employees.
public class Question5 {
    public static void main(String[] args) {
        Employee e1=new Employee("Shubham",40);
        Employee e2=new Employee("Vrushabh",30);
        Employee e3=new Employee("Shyam",400);
        List<Employee> l= Arrays.asList(e1,e2,e3);
        BiConsumer<String,Integer> print=(a,b)->{
            System.out.println("Name is :"+a +"and his salary"+b);
        };
        BiConsumer<String,Integer> log=(a,b)->{
            System.out.println("[Log] Name"+a+ "Salary :"+b);
        };
        BiConsumer<String,Integer> combined=print.andThen(log);
        for(Employee e:l){
            combined.accept(e.getName(),e.geSalary());
        }
        }
}
class Employee{
    private String name;
    private int salary;
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int geSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String toString(){
        return "Employee Name:"+this.name +"Salary :"+this.salary;
    }


}