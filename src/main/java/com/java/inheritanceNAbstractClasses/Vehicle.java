package com.java.inheritanceNAbstractClasses;

import com.java.compositionNAggregation.Engine;

public abstract class Vehicle {
    abstract void getVehicleType();

    abstract void getVehicleName();

    abstract Engine engine();
}

class Car extends Vehicle {

    String name;
    String type;
    Engine engine;

    Car(String name, String type) {
        name = name;
        type = type;
    }


    @Override
    void getVehicleType() {

    }

    @Override
    void getVehicleName() {

    }

    @Override
    Engine engine() {
        return engine;
    }

}
