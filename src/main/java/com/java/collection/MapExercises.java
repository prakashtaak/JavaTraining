package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExercises {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("p","b","a","b");
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        Map<Integer,Long> mapOfIntLongs =new HashMap<>();

        mapOfIntLongs.put(12,102l);
        mapOfIntLongs.put(15,105l);
        mapOfIntLongs.put(14,104l);
        mapOfIntLongs.put(18,108l);
        //overrides the value for key 18
        //mapOfIntLongs.put(18,110l);

       /* if(mapOfIntLongs.containsKey(14)){
            Long value = mapOfIntLongs.get(14);
            value=value+1;
            mapOfIntLongs.put(14,value);
        }*/

       mapOfIntLongs.merge(121,1L,Long::sum);
        mapOfIntLongs.merge(121,12L,Long::sum);
       //throws exception if key is not present
        mapOfIntLongs.compute(14,(x,y) -> y +1);

        //doesn't throw exception if key is not present
       mapOfIntLongs.computeIfPresent(11,(x,y) -> y+2);

        //doesn't throw exception if key is not present
        mapOfIntLongs.computeIfAbsent(18,(y) -> 200l);

        mapOfIntLongs.forEach((key,value) -> System.out.println("Key is "+ key +" value is "+value));



    }
}
