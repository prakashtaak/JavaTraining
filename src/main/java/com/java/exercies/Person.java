package com.java.exercies;

public class Person {
    static int a;
    //gets called when this class 'Person' is loaded
    // and one way to load class is using Class.forName("fullyQualifiedClassName")
    // try with an exercise to get familiar
    static{
        System.out.println("static block called");
       a=10;
    }

    static  int max_val=40;
    private  String name;
    private int age;
    private float height;

    public Person() {
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

   @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }


    public String print() {
        return "name :"+name+" age :"+age;
    }
}
