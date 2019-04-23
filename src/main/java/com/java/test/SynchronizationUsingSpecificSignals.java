package com.java.test;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class SynchronizationUsingSpecificSignals {

     Lock lock = new ReentrantLock();
     int size = 0;
     Condition notFull = lock.newCondition();
     Condition notEmpty = lock.newCondition();

     void take() {

        try {
            lock.lock();
            while (size == 0) notEmpty.await();
            size --;
            Thread.sleep(100);
            System.out.println("I am thread "+Thread.currentThread().getName());
            notFull.signal();
        } catch (InterruptedException ex) {
        } finally {
            lock.unlock();
        }

    }

    void put() {
        try {
            lock.lock();

            while (size == 1) {
                notFull.await();
            }
            Thread.sleep(100);
            size++;
            System.out.println("I am thread "+Thread.currentThread().getName());

            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private static <E> E remove() {
        return (E) new Object();
    }

    public static void main(String[] args) {

        SynchronizationUsingSpecificSignals obj=new SynchronizationUsingSpecificSignals();



            Thread t1=new Thread(() -> { IntStream.range(0,10).forEach(x -> obj.put());},"Thread1");

            Thread t2=new Thread(() ->  { IntStream.range(0,10).forEach(x -> obj.take());},"Thread2");
        t2.start();
            t1.start();





    }
}
