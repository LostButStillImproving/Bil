package com.undervisning.car;

public class Car {


    public enum Brand {
        TOYOTA, MERCEDES, KIA
    }
    final Brand brand;

    private PEDALS pedals;
    public Wheel wheel = new Wheel();
    public Engine engine = new Engine();

    boolean isOn = false;
    int wheelDirection = 0;
    double currentSpeed = 0;
    double currentRPM = 0;
    double maxRPM = 1000;
    double odometer = 0;
    int currentGear = 0;
    String keyCode;
    public Car(Brand brand, String keyCode) {
        this.brand = brand;
        this.keyCode = keyCode;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(double currentRPM) {
        this.currentRPM = currentRPM;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }
}
