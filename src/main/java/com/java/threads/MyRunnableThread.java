package com.java.threads;

import com.java.generics.Employee;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class MyRunnableThread implements Callable<Integer> {

    int startIndex;
    int endIndex;

    public MyRunnableThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Integer call() throws Exception {
        return IntStream.range(startIndex,endIndex).sum();
    }
}
