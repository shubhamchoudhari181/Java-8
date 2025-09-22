package com.java8.Pracice.MethodreferenceQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;

//Create a class Employee with a constructor (String name, int salary).
//Use BiFunction<String, Integer, Employee> with constructor reference to create employee objects.
class Employee{
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class QUESTION7 {
    public static void main(String[] args) {
        BiFunction<String,Integer,Employee> create=Employee::new;
        System.out.println(create.apply("Shubham",450000));
    }

}
