package com.java.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueExercise {
    public static void main(String[] args) {
        PriorityQueue<Integer> intList =new PriorityQueue<>(20,(Integer o1, Integer o2)  -> 02 -01);

        intList.add(40);
        intList.add(50);
        intList.add(60);
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println(intList.peek());

    }
}
