package com.java.generics;



public class PermanentEmployee extends Employee {

    private  double bonusPercent;
    public PermanentEmployee(double bonusPercent, String name, int age, double salary){
        super(name,age,salary);
        this.bonusPercent=bonusPercent;
    }



    @Override
    public double getBonusAmount() {
        return getMinSalary() * bonusPercent / 100;
    }
}
