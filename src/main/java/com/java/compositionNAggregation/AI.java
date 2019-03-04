package com.java.compositionNAggregation;

public class AI {

    boolean autoMirrorClose;
    boolean autoDriver;
    boolean parkingAssistance;

    public AI(boolean autoMirrorClose, boolean autoDriver, boolean parkingAssistance) {
        this.autoMirrorClose = autoMirrorClose;
        this.autoDriver = autoDriver;
        this.parkingAssistance = parkingAssistance;
    }

    public boolean isAutoMirrorClose() {
        return autoMirrorClose;
    }

    public boolean isAutoDriver() {
        return autoDriver;
    }

    public boolean isParkingAssistance() {
        return parkingAssistance;
    }

    @Override
    public String toString() {
        return autoMirrorClose + " | " + autoDriver + " | " + parkingAssistance;
    }
}
