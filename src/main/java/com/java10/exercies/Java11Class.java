package com.java10.exercies;


import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Java11Class{
    TimeUnits timeUnits;
    Java11Class(int a){
        this.timeUnits = new TimeUnits(a);
    }
    long HOURS(){
        return  timeUnits.MINUTES();
    }
    long SECONDS(){
        return timeUnits.SECONDS();
    }
    long MINUTES(){
        return timeUnits.MINUTES();
    }
    class TimeUnits{

        int a;

        final int timeUnitsMultiplier = 1000;

        public TimeUnits(int a) {
            this.a=a;
        }
        public long SECONDS(){
            return  MILLI_SEC() * timeUnitsMultiplier;
        }
        public long MICRO_SEC(){
            return a;
        }
        public long MILLI_SEC(){
            return MICRO_SEC() * timeUnitsMultiplier;
        }
        public long MINUTES(){
            return SECONDS() * 60 ;
        }
        public long HOURS(){
            return MINUTES() * 60 ;
        }

    }

    public static void main(String[] args) {
       /* CompletableFuture.supplyAsync(Java11Class::factory)
                .orTimeout(2,TimeUnit.SECONDS)
                .thenAccept(System.out::println);

       Sleep.sleep(100);*/

        Java11Class squareFunction =new Java11Class(3);

       System.out.println(squareFunction.HOURS());
    }
    /*static double checkIfEligibleFOrLamda(int a,Inner obj){
        return obj.compute(a);
    }
*/
    private static Integer factory() {
        Sleep.sleep(10);
        return 10;
    }
}
