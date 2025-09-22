package com.java8.Pracice.Consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {
    public static void main(String[] args) {
        Employee e1=new Employee(01,"Shubham",10000);
        Employee e2=new Employee(2,"Vrushabh",30000);
        Employee e3=new Employee(03,"Saurabh",100234);
        List<Employee> l= Arrays.asList(e1,e2,e3);
        Consumer<Employee> printemp=x-> {
            System.out.println("Employee Name" +x.getName()+"  Id is "+ x.getId()+"  having sa0lry is "+x.getSalary());
        };
        for(Employee e:l){
            printemp.accept(e);
        }
    }
}
class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
