package com.undervisning.car;

public class Wheel {

    final public int MAX_WHEEL_DIRECTION = 360;
    final public int MIN_WHEEL_DIRECTION = -360;
    private int currentWheelDirection = 0;

    public int getWheelDirection() {
        return currentWheelDirection;
    }


    public void turnWheelLeft() {
        if (this.currentWheelDirection + 45 > MAX_WHEEL_DIRECTION) {
            this.currentWheelDirection = MAX_WHEEL_DIRECTION;
        } else {
            this.currentWheelDirection += 45;
        }
    }

    public void turnWheelRight() {
        if (this.currentWheelDirection - 45 < MIN_WHEEL_DIRECTION) {
            this.currentWheelDirection = MIN_WHEEL_DIRECTION;
        } else {
            this.currentWheelDirection -= 45;
        }
    }
}
