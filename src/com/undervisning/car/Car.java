package com.undervisning.car;

public class Car {

    final Brand brand;
    final Color color;
    public AcceleratorPedal acceleratorPedal = new AcceleratorPedal();
    public BreakPedal breakPedal = new BreakPedal();
    public Wheel wheel = new Wheel();
    public Engine engine = new Engine();

    double currentSpeed = 0;
    double currentRPM = 0;
    double maxRPM = 1000;
    double odometer = 0;
    int currentGear = 0;
    String keyCode;
    public Car(Brand brand, Color color, String keyCode) {
        this.brand = brand;
        this.color = color;
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
