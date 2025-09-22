package com.java8.Pracice.BiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

//4.  Apply BiConsumer to update salaries of employees based on designation.
public class Question4 {
    public static void main(String[] args) {
        Employee1 e1=new Employee1("Shubham",10,"Developer");
        Employee1 e2=new Employee1("Shaym",50,"Tester");
        Employee1 e3=new Employee1("Raj",100,"Cloud");
        List<Employee1> l= Arrays.asList(e1,e2,e3);
        BiConsumer<Employee1,Integer> cd=(a,b)->{
            a.setSalary(b);
        };
        for(Employee1 e:l){
            if(e.getDesig().equalsIgnoreCase("developer")){
                cd.accept(e,3000);
            }
            else if(e.getDesig().equalsIgnoreCase("tester")){
                cd.accept(e,50000);
            }
            else if(e.getDesig().equalsIgnoreCase("cloud")){
                cd.accept(e,6000);
            }
            else {
                continue;
            }
        }
        System.out.println(l);

    }
}
class Employee1{
    private String name;
    private Integer salary;
    private String desig;
    public Employee1(String name,Integer salary,String desig){
        this.name=name;
        this.salary=salary;
        this.desig=desig;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer geSalary(){
        return salary;
    }
    public void setSalary(Integer salary){
        this.salary=salary;
    }
    public String getDesig(){
        return desig;
    }
    public void setDesig(String desig){
        this.desig=desig;
    }
    public String toString(){
        return "Employee Name:"+this.name +"Salary :"+this.salary+" Designation :"+this.desig;
    }


}