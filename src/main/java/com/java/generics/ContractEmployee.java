package com.java.generics;


public class ContractEmployee implements IEmployee {

    private String name;
    private int age;
    private double salary;

    ContractEmployee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getMinSalary() {
        return 0;
    }
}
