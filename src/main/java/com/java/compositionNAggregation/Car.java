package com.java.compositionNAggregation;

public class Car {

    private String carName;
    private String brand;
    private double price;
    private Engine engine;
    private AI ai;

    public Car() {
    }

    public Car(String carName, String brand, double price, Engine engine, AI ai) {
        this.carName = carName;
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        this.ai = ai;
    }

    public Car(String carName, String brand, double price, Engine engine) {
        this.carName = carName;
        this.brand = brand;
        this.price = price;
        this.engine = engine;

    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setAi(AI ai) {
        this.ai = ai;
    }

    public String getCarName() {
        return carName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        String aiString = "";
        if (ai != null) {
            aiString = ai.toString();
        }
        return carName + " | " + brand + " |" + price + "| " + engine.toString() + " | " +
                aiString;
    }
}
