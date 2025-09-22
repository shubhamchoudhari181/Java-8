package com.java8.Pracice.Supploer;

import java.util.function.Supplier;

public class Question3 {
    public static void main(String[] args) {
        Supplier<Employee> gen=()->new Employee();
        System.out.println(gen.get());
    }
}
class Employee{
    private int id;
    private String name;

    public Employee() {
        this.id = 10;
        this.name ="Default";
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

