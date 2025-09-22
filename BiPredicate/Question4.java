package com.java8.Pracice.BiPredicate;

import java.util.function.BiPredicate;
//4.  Use BiPredicate to compare age and salary of two employees.
public class Question4 {
    public static void main(String[] args) {
        Employee e1=new Employee("Shubham",20000L,20);
        Employee e2=new Employee("Shrikant",22000L,21);
        Employee e3=new Employee("Shivraj",22000L,21);
        //here we declare salry through L for Always use L when passing long values, especially when the method/constructor expects Long.
        BiPredicate<Employee,Employee> compare=(x,y)->{
            boolean b = x.getAge() == y.getAge();
            boolean c= x.getSalary().equals(y.getSalary());
            return b && c;

        };
        System.out.println(compare.test(e1,e2));
        System.out.println(compare.test(e2,e3));

    }
}
class Employee{
    private String name;
    private Long salary;
    private int age;

    public Employee(String name, Long salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

