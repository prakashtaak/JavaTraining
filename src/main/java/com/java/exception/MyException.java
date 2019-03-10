package com.java.exception;

public class MyException extends RuntimeException {

    int errorCode;


    public MyException(String errorMessage,int errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public MyException(String errorMessage,Throwable tr){
        super(errorMessage,tr);
    }


    static float method1() throws MyException{
        float a=0;
      try {
           a= 10/0;
      }catch (Exception e){
          throw new MyException("mysmessage  | divide by zero",e);
      }
      return a;
    }

    public static void main(String[] args) throws MyException {
            method1();

    }
}
