package com.java.interfaces;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        /*MyInterface mi = new MyInterface() {
            @Override
            public int compute(int a, int b) {
                return a+b;
            }
        };*/

        /*MyInterface add2Ints1 =(int a,int b) -> { return a+b;};*/

        /*MyInterface add2Ints2 =(a,b) -> { return a+b;};*/

        MyInterface add2Ints =(a,b) -> a+b;
        MyInterface multiply2Ints =(a,b) -> a*b;

        System.out.println(add2Ints.compute(4,5));
        System.out.println(multiply2Ints.compute(4,5));
    }
}
interface MyInterface{

    int compute(int a,int b);
    default void mycompute(){

    }

}

