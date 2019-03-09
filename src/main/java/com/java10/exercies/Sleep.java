package com.java10.exercies;

public class Sleep {
    public static void sleep(long millsec){
        try {
            Thread.sleep(millsec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
