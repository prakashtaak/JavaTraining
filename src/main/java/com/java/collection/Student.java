package com.java.collection;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String department;
    private float score;

    public Student(String name, int age, String department, float score) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public float getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return  this.age -o.age;
    }

    @Override
    public String toString() {
        return name+"|"+age+"|"+department+"|"+score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, department, score);
    }
}
