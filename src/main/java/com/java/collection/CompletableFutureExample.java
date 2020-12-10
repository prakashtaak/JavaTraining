package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureExample{


    public static void main(String[] args) {





        /*CompletableFuture<String> completableFuture=null;

        completableFuture = completableFuture.supplyAsync(new Supplier<String>() {

            @Override
            public String get() {

                //sleep(1000);
                return "prakash";
            }


            void sleep(int mills){
                try {
                    System.out.println("Inside supplier | Thread "+Thread.currentThread().getName());
                    Thread.sleep(mills);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).thenApplyAsync(sup -> combineStr(sup , "kumar")).thenApplyAsync(sup -> combineStr(sup , "tok"));


        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/


    }
    static  String combineStr(String str,String str1){
        System.out.println("Inside combine | Thread "+Thread.currentThread().getName());
        return str+str1;
    }
}
