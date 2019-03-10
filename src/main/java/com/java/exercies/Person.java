package com.java.exercies;

public class Person implements Comparable<Person>{

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


    public String toString() {
        return "name :"+name+" age :"+age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
