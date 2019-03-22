package com.java.compositionNAggregation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.java.exercies.Constants.DIESEL;
import static com.java.exercies.Constants.PETROL;

public class CarClientMock {

    public CarClient carClient;
    public Car[] cars;


    public CarClientMock(){

        Engine engine2 = new Engine("ford", 4, PETROL);
        Engine engine3 = new Engine("ford", 4, DIESEL);
        Engine engine4 = new Engine("ford", 0, PETROL);
        Car car2 = new Car("i10", "hundai", 5.0, engine2);
        Car car3 = new Car("i10", "hundai", 8.15, engine3);
        Car car4 = new Car("i10", "hundai", 9.0, engine4);
        cars=new Car[3];
        cars[0] = car2;
        cars[1] = car3;
        cars[2] = car4;
        carClient = new CarClient();

    }

    public List<Car> getRequiredCars(int noOfStrokes){
        Car[] cars1 = carClient.getCarOfRequiredType(cars,noOfStrokes);

       List<Car> result = Arrays.stream(cars1).filter(e -> e!=null).collect(Collectors.toList());
       return result;
    }


}
