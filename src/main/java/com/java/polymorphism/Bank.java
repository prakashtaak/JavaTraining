package com.java.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

/*
    Example to demonstrate run time polymorphism
 */
public  class Bank {
    private float interestRate ;
    Bank(float interrestRate){
        interestRate=interrestRate;
    }

    /*abstract float getRateOfInterest();*/
    public float  getRBIIntrestRate(){
        return interestRate;
    }
    public void display(){
        System.out.println("This is bank class");
    }
}
class SBI extends Bank{


    float interestRate ;

    SBI(float interestRate,float sbiIntrestRate){
        super(interestRate);
        this.interestRate=sbiIntrestRate;
    }

    public float getRateOfInterest(){return interestRate + getRBIIntrestRate();
    }

}
/*class ICICI extends Bank{
    float interestRate =7.3f;
    @Override
    public float getRateOfInterest(){return interestRate;}
}
class AXIS extends Bank{
    float interestRate =9.0f;
    @Override
    public float getRateOfInterest(){return interestRate;}
}*/
class TestPolymorphism{
    public static void main(String args[]){

        SBI ob=new SBI(4.0f,4.2f);
        SBI ob1=new SBI(4.0f,4.2f);
        SBI ob3 = ob1 = ob;
        System.out.println(ob.getRateOfInterest());

        List<Bank> banks=new ArrayList<>();
        banks.add(new SBI(23.4f,4.5f));


        new LinkedList<Integer>();
        /*Bank b;
        SBI ob=new SBI();
        ob.display();


        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+ b.interestRate);

        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+ b.interestRate);

        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+ b.interestRate);*/
    }
}