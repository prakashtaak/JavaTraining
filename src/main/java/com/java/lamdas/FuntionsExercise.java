package com.java.lamdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FuntionsExercise {

   final static Predicate<Integer> func = (i) -> i % 2 == 0;


    public static void main(String[] args){
        IntStream.range(0,15).filter(t -> func.test(t));
        ExtendedConverter obj=new ExtendedConverter();
        Function<Double,Double> intermRes = obj.curry1(10.0).andThen(a -> a+32);
       System.out.println(intermRes.apply(2.0));
       Integer i=90;
       int j=i;
    }


}

class UtilFunctions{
    static boolean isEven(int a){
        return a %2 ==0;
    }
}

@FunctionalInterface
interface MyFunction{

    public boolean test(int i);
}
  class ExtendedConverter implements Converter<Double,Double,Double>{

      @Override
      public Double apply(Double aDouble, Double aDouble2) {
          return aDouble * aDouble2;
      }
  }

 interface Converter<T,U,V> extends
         BiFunction<T, U, V> {
    default Function<U,V> curry1(T t){
        return u -> apply(t,u);
    }

}