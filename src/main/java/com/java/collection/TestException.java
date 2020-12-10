package com.java.collection;

import java.util.List;

public class TestException {

    static void compute(){
        try{
            throw new RuntimeException("ads");
        }finally {
            return;
        }

    }


    public static void main(String[] args) {
        compute();
        System.out.println("asd");
    }
}
