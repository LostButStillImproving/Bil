package com.undervisning.car;

public class Car extends Engine {
    final Brand brand;
    final Color color;
    final String keyCode;

    public Car(Brand brand, Color color, String keyCode) {
        this.brand = brand;
        this.color = color;
        this.keyCode = keyCode;
    }
    Dashboard dashboard = new Dashboard();
    Engine engine = new Engine();
    Wheel wheel = new Wheel();
    AcceleratorPedal acceleratorPedal = new AcceleratorPedal();
    BreakPedal breakPedal = new BreakPedal();

    public void pushAcceleratorPedal(){
        acceleratorPedal.pushPedal();

        if (acceleratorPedal.pedalDown && breakPedal.pedalDown){
            this.engine.increaseRPM();
        }   else if (acceleratorPedal.pedalDown){
            this.engine.increaseCurrentSpeed();
        }
    }
    public void pushBreakPedal(){
        breakPedal.pushPedal();
        if (breakPedal.pedalDown && acceleratorPedal.pedalDown){
            this.engine.increaseRPM();
        }   else if (breakPedal.pedalDown) {
            this.engine.decreaseRPM();
            this.engine.decreaseCurrentSpeed();
        }
    }

    public void turnEngineOff(){
        if (this.engine.isEngineOn()){
            this.engine.TurnEngineOff();
        }
    }
    public void turnEngineOn(String keyCode){
        if (!this.engine.isEngineOn()) {
            this.engine.turnEngineOn( keyCode);
        }
    }

    public static void main(String[] args) {
        Car car = new Car(Brand.KIA, Color.BLACK, "");
        System.out.println(        car.dashboard.getRPM(car.engine) + " " + car.dashboard.getSpeed(car.engine));
        car.turnEngineOn("");
        car.pushBreakPedal();
        car.pushAcceleratorPedal();
        System.out.println(        car.dashboard.getRPM(car.engine) + " " + car.dashboard.getSpeed(car.engine));

    }
}
