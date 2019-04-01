package com.java.generics;


public class TemporaryEmployee extends Employee {

     double bonusPercent;

    public TemporaryEmployee(double bonusPercent, String name, int age, double salary) {

        super(name, age, salary);
        this.bonusPercent = bonusPercent;
    }


    @Override
    public double getBonusAmount() {
        return getMinSalary() * bonusPercent / 100;
    }
}
