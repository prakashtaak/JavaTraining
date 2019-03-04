package com.java.exercies;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args ) throws CloneNotSupportedException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class.forName("com.java.exercies.Person");
    //Person person1=new Person("prakash",28,5.8f);




       // Person person2=(Person)person1.clone();
        /*Person person3 = (Person)Class.forName("com.java.exercies.Person").newInstance();
        person3.setName("Anil");
        System.out.println(person3.getName());*/
        /*StaticVariableExercise obj=new StaticVariableExercise("a1");
        StaticVariableExercise obj1=new StaticVariableExercise("a1");
        StaticVariableExercise ob2=new StaticVariableExercise("a1");
        System.out.println(obj.computeSomeValue(51));
        System.out.println(obj.computeSomeValue(52));
        System.out.println(obj.computeSomeValue(53));*/


        //int value= Constants.VARIABLE_1 ;




    }
}
