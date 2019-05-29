package com.java.collection;



import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListExercises {



    public static void main(String[] args) {
       /* Queue<Integer> ints = new LinkedListExercise<>();
        ((LinkedListExercise<Integer>) ints).add(12);
        PriorityQueue<Integer> intp=new PriorityQueue<>();*/

        List<Integer> integers1 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,89,10));

        List<Integer> newIntegers =new ArrayList<>(Arrays.asList(100,101,102,103));


        List<Integer> subList = integers1.subList(1,4);
        integers1.addAll(newIntegers);

        //integers1.forEach(System.out::println);
        integers1.forEach(x ->{
            System.out.println("Sublist Value is "+x);
        } );

        List<Integer> integers2 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,89,10));


        Predicate<Integer> isEvenList = x -> x % 2==0;
        //using lamda expression
       int evenNoList = integers1.stream().filter(x -> x % 2==0).collect(Collectors.summingInt(x -> x));
        //evenNoList.forEach(System.out::println);
       /* //using Predicates
        integers1.stream().filter(isEvenList).collect(Collectors.toList());
        //using Method reference
        integers1.stream().filter(ListExercises::isEven).collect(Collectors.toList());


        integers1.stream().filter(integer ->  integer %2 !=0).collect(Collectors.toList());*/
    }

    static boolean  isEven(Integer i){
        return i % 2 ==0;
    }


}
