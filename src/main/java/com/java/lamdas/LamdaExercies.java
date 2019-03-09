package com.java.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LamdaExercies {

    static int computeGuvenInput(List<Integer> listOfValues, Predicate<Integer> selector) {
        int sum = 0;
        /*for (Integer value : listOfValues) {
         *//*if (value % 2 == 0) {
                sum += value;
            }*//*
            if(selector.test(value)){
                sum += value;
            }
        }*/
        /*return listOfValues.stream()
                .filter(selector)
                .reduce(0,(a,b) -> a+b);*/
        /*return listOfValues.stream()
                .filter(selector)
                .mapToInt(e -> e)
                .sum();*/
        return listOfValues.stream()
                .filter(selector)
                .reduce(Integer::sum).get();
        // return sum;
    }

    public static void main(String[] args) {
        List<Integer> listOfValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(computeGuvenInput(listOfValues, Util::isEven));
        System.out.println(computeGuvenInput(listOfValues, Util::isOdd));


    }

    static class Util {
        static boolean isEven(Integer integer) {
            return integer % 2 == 0;
        }

        static boolean isOdd(Integer integer) {
            return integer % 2 != 0;
        }
    }
}
