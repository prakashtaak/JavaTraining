package com.java.enumExcercise;

public class EnumExample {

    enum TimeUnits{
        SECOND(1000,23),MINUTE(60000000,21);
        private int millis,nanos;

         TimeUnits(int millis,int nanos) {
            this.millis = millis;
            this.nanos=nanos;
        }

        public int getMillis() {
            return millis;
        }
    }

   static int  getMeMilliseonds(String name,int value){
       return TimeUnits.valueOf(name).millis * value;
    }
    public static void main(String[] args) {
    String timeValue = "SECOND";

        System.out.println(getMeMilliseonds("SECOND",2));
        System.out.println(TimeUnits.valueOf(timeValue).getMillis());
    }
}
