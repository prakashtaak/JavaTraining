package com.java.exercies;

public class StaticVariableExercise {

    // class variable, it is shared across all the instance.
    //we can also say as, it is visible to be used across all instances of this class
    static  int counter =0;




    public StaticVariableExercise() {
        counter++;

    }
    public StaticVariableExercise(int a) {
        counter=a;
        counter++;
    }

   public   int getCountOfObjects(){
        return counter;
    }


    public static void main(String[] args) {
        StaticVariableExercise obj=new StaticVariableExercise(10);

        StaticVariableExercise obj2=new StaticVariableExercise();
        StaticVariableExercise obj3=new StaticVariableExercise();
        StaticVariableExercise obj4=new StaticVariableExercise();
        StaticVariableExercise obj5=new StaticVariableExercise();
        StaticVariableExercise obj6=new StaticVariableExercise();


        System.out.println(StaticVariableExercise.counter);

    }

}
