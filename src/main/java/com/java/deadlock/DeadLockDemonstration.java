package com.java.deadlock;


import java.util.stream.IntStream;

public class DeadLockDemonstration {

    Object ob1=new Object();
    Object ob2=new Object();

    void resource1() throws InterruptedException {
        synchronized (ob1){
            synchronized (ob2) {
                Thread.sleep(100);
            }
        }
    }

    void resource2() throws InterruptedException {
        synchronized (ob2){
            synchronized (ob1) {
                Thread.sleep(100);
            }
        }
    }


    public static void main(String[] args) {
        DeadLockDemonstration object = new DeadLockDemonstration();
        IntStream.range(0, 5).forEach(x -> {
            Thread thread = new Thread(() -> {
                try {
                    object.resource1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread thread2 = new Thread(() -> {
                try {
                    object.resource2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
            thread2.start();

        });
    }
}
