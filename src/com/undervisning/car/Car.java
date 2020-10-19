package com.undervisning.car;

public class Car {
    boolean engineOn = false;
    int wheelDirection = 0;
    final int MAX_WHEEL_DIRECTION = 360;
    final int MIN_WHEEL_DIRECTION = -360;
    double currentSpeed = 0;
    double currentRPM = 0;
    double maxRPM = 1000;
    double odometer = 0;
    int currentGear = 0;
    String keyCode;

    public Car(String keyCode) {
        this.keyCode = keyCode;
    }

    public boolean isEngineOn() {
        if (engineOn == true) {
            System.out.println("ON!");
        } else {
            System.out.println("OFF");
        }
        return engineOn;
    }

    public void startEngine(String keyCode) {
        if (keyCode.equals("hunter123")) {
            this.engineOn = true;
            System.out.println("ON!");
        } else {
            System.out.println("Wrong keycode");
        }
    }

    public void TurnOffEngine() {
        System.out.println("OFF");
        this.engineOn = false;
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

    public int getWheelDirection() {
        return wheelDirection;
    }

    public void turnWheelLeft() {
        if (this.wheelDirection + 45 > MAX_WHEEL_DIRECTION) {
            this.wheelDirection = MAX_WHEEL_DIRECTION;
        } else {
            this.wheelDirection += 45;
        }
    }

    public void turnWheelRight() {
        if (this.wheelDirection - 45 < MIN_WHEEL_DIRECTION) {
            this.wheelDirection = MIN_WHEEL_DIRECTION;
        } else {
            this.wheelDirection -= 45;
        }
    }
}
