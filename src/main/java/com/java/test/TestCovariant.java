package com.java.test;

public class TestCovariant {



}
class A{
    A method1(){
        return new A();
    }
}
class B extends A{

    @Override
    B method1() {
        return new B();
    }
}