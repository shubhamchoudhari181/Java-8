package com.java8.Pracice.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question5 {
    public static void main(String[] args) {
        Predicate<Integer> isalary=x->x>50000;
        Employee s1=new Employee(10000,1,"Shubham");
        Employee s2=new Employee(60000,4,"Sh");
        Employee s3=new Employee(101000,7,"Shrikant");
        List<Employee> l= Arrays.asList(s1,s2,s3);
        ArrayList<Employee> filteredstudent=new ArrayList<>();
        for(Employee s:l){
            if(isalary.test(s.getSalary())){
                filteredstudent.add(s);
            }

        }
        System.out.println(filteredstudent);
    }
}
class Employee{
    private int id;
    private Integer Salary;
    private String name;

    public Employee(Integer salary, int id, String name) {
        Salary = salary;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Salary=" + Salary +
                ", name='" + name + '\'' +
                '}';
    }
}
