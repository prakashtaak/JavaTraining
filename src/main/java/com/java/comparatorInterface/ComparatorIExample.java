package com.java.comparatorInterface;

import com.java.exercies.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorIExample {
    String name = "";
    static Comparator<Person> personComparator = (Person o1, Person o2) -> {
        int finalResult = -1;
        finalResult = o1.getName().compareTo(o2.getName());
        if (finalResult == 0) {
            finalResult = o1.getAge() - o2.getAge();
        }
        return finalResult;
    };



    public static void main(String[] args) {

        Person[] persons = {new Person("prakash",28,5.9f),
                new Person("prakash",27,5.9f),
                new Person("Anil",28,5.9f)};

        Arrays.sort(persons,personComparator);

       // Arrays.sort(persons);

        Arrays.stream(persons).forEach(System.out::println);
    }

}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}