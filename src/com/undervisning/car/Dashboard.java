package com.undervisning.car;

class Dashboard extends Engine {

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
}
