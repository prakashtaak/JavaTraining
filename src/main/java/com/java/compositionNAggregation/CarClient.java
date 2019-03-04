package com.java.compositionNAggregation;

import java.util.Arrays;

import static com.java.exercies.Constants.PETROL;
import static com.java.exercies.Constants.DIESEL;

public class CarClient {

    static Car[] getCarOfRequiredType(Car[] cars, int noOfStrokes) {

        int carLenght = cars.length;
        Car filteredCars[] = new Car[carLenght];
        int j = 0;
        for (int i = 0; i < carLenght - 1; i++) {
            if (cars[i].getEngine().getNoOfStrokes() == noOfStrokes) {
                filteredCars[j] = cars[i];
                j++;
            }       }
        return filteredCars; }

    public static void main(String[] args) {

        Engine engine = new Engine("ford", 5, PETROL);
        Engine engine2 = new Engine("ford", 4, PETROL);
        Engine engine3 = new Engine("ford", 4, DIESEL);
        Engine engine4 = new Engine("ford", 0, PETROL);

        AI ai = new AI(false, false, true);
        //Car car = ;
        Car car2 = new Car("i10", "hundai", 5.0, engine2);
        Car car3 = new Car("i10", "hundai", 8.15, engine3);
        Car car4 = new Car("i10", "hundai", 9.0, engine4);
       // System.out.println("carName | ");
        //System.out.println(car2);
        Car[] cars = {
                new Car("i10", "hundai", 6.15, engine, ai), car2, car3, car4
        };
       /* Car[] result = getCarOfRequiredType(cars,4);
        for(Car car:result){
            if(car!=null)
            System.out.println(car);
        }*/

        Arrays.stream(cars).filter(car -> car.getEngine().getNoOfStrokes() == 4).forEach(System.out::println);

    }
}
