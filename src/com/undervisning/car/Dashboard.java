package com.undervisning.car;

class Dashboard {

    Speed speed = Speed.DEAD;
    RPM rpm = RPM.DEAD;

    public Speed getSpeed(Engine engine) {
        this.speed = engine.getSpeed();
        return speed;
    }

    public RPM getRPM(Engine engine) {
        this.rpm = engine.getRPM();
        return this.rpm;
    }
    public void isEngineOn(Car car){
        if (car.engine.isEngineOn()){
            System.out.println("The car is ON");
        } else {
            System.out.println("The Car is OFF");
        }
    }
    public void printSpeed(Car car){
        System.out.println(car.dashboard.speed);
    }
}
