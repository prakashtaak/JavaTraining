package com.java.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LinkedListExercise {

    public static void main(String[] args) {


        Stack<Integer> intStack =new Stack<Integer>();
        LinkedList<Integer> intList =new LinkedList<>();
       intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        intList.offer(60);

        System.out.println("Dequed element "+intList.poll());

        System.out.println(" peek element is "+intList.peek());

        intList.pollLast();


        intList.forEach(System.out::println);
    }
}
