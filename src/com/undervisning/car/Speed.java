package com.undervisning.car;

public enum Speed {
    DEAD, SLOW, MEDIUM, FAST;

    Speed getSpeed(){
        return Speed.valueOf(this.name());
    }
    void printSpeed() {
        System.out.println(this.getSpeed());
    }
}

