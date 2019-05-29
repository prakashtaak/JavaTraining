package com.java.collection;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctSubStr {

    public static void main(String[] args) {
        String str = "aaaaabcd";
        PriorityQueue<CharCountSet> queue = new PriorityQueue<>((ob1, ob2) -> ob2.count.compareTo(ob1.count));
        Map<Character,Integer> mc=new HashMap<>();
        for(char cd:str.toCharArray()){
            mc.merge(cd,1,Integer::sum);
        }

        mc.forEach((x,y) -> System.out.println(x  +"  "+y));

        Map<Character, Long> charMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Character, Long> chMap : charMap.entrySet()) {
            queue.add(new CharCountSet(chMap.getKey(), chMap.getValue()));
        }
        queue.forEach(q -> System.out.println(q.count));
        CharCountSet prev = new CharCountSet('#', 0L);

        int count = 0;
        String distinctStr = "";
        while (!queue.isEmpty()) {

            CharCountSet cs = queue.peek();
            queue.poll();

            distinctStr += cs.ch;
            cs.count--;

            if (prev.count > 0) {
                distinctStr += prev.ch;
                prev.count--;

            }


            if (prev.count == 0) {
                prev = cs;
            } else if (cs.count
                    > 0) {
                queue.add(cs);
            }


        }


        System.out.println(distinctStr);

    }

    static class CharCountSet {
        char ch;
        Long count;

        public CharCountSet(char ch, Long count) {
            this.ch = ch;
            this.count = count;
        }


    }


}
