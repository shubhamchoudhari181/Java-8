package com.java8.Pracice.BiFunction;

import java.util.function.BiFunction;

//Write a program using BiFunction<Employee, Double, Employee> to increase the salary of an employee by a
// given percentage and return the updated Employee object.
public class Question1 {
    public static void main(String[] args) {
        Employee e1=new Employee("Shubham",20000);
        Employee e2=new Employee("Gaurav",10000);
        Employee e3=new Employee("Sham",30000);
        BiFunction<Employee,Double,Employee> incrementsalry=(a,b)->{
            int sal=a.getSalary();
            int newsal=(int) (sal+sal*(b/100));
            a.setSalary(newsal);
            return a;
        };
        System.out.println(incrementsalry.apply(e1,5.0));

    }
}
class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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

