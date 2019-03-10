package com.java.exercise.test2;


import com.java.exercies.Constants;
import com.java.exercies.Person;
import com.java.exercies.StaticUtils;
import com.java.exercies.StaticVariableExercise;

import java.util.Arrays;
import java.util.Comparator;

public class TestApp {
    public static void main(String[] args) {
        int result = StaticUtils.doubleIt(10);

        int[] arr={2,3,1,5,4,6};
        Comparator<Person> personComparator = (person1,person2) -> {
            if(person1.getAge() >person2.getAge()){
                return 1;
            }
            return -1;
        };
    }
}
