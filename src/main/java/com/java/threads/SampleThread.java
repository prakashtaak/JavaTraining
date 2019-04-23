package com.java.threads;

public class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new SampleThread(), "prakash");
        thread.start();


        Thread threadRunnable = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }
                , "RunnableThread");

        threadRunnable.start();
    }
}
