package com.java.compositionNAggregation;

public class Engine {

    private String brand;
    private int noOfStrokes;
    private String fuelType;

    public Engine(String brand, int noOfStrokes, String fuelType) {
        this.brand = brand;
        this.noOfStrokes = noOfStrokes;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getNoOfStrokes() {
        return noOfStrokes;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return brand +"| "+ noOfStrokes + " | "+ fuelType  +"|";
    }
}
