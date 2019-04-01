package com.java.generics;

public abstract class Employee implements IEmployeeBonus,IEmployee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

      public double getMinSalary(){
        return  2000.0;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public double getSalary() {
        return salary;
    }


}
