package com.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {


        ExecutorService executors = Executors.newFixedThreadPool(5);

        int startRange = 0, endRange = 10;
        int result = 0;


        int subRangeForTasks = (startRange + endRange) / 5;
        List<MyRunnableThread> callables = new ArrayList<>();

        int tempStart = 0,tempEnd =subRangeForTasks;
        for (int i = 0; i < 5; i++) {

            callables.add(new MyRunnableThread(tempStart, tempEnd ));
            tempStart = tempEnd;
            tempEnd += subRangeForTasks;
        }

        List<Future<Integer>> tasksResult = executors.invokeAll(callables);

        List<Integer> subResults = tasksResult.stream().map(future -> {

            Integer sum = 0;
            try {
                sum = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            return sum;
        }).collect(Collectors.toList());

        for (Integer subResult : subResults) {
            result += subResult;
        }

        System.out.println(result);
        executors.shutdown();

        //using parallel streams
        int resultWithhParallelStream = IntStream.range(0,10).parallel().sum();
        System.out.println("with parallel stream " + resultWithhParallelStream);


    }
}
