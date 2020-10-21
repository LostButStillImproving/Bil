package com.undervisning.car;

public class Car extends Engine {
    final Brand brand;
    final Color color;
    Engine engine = new Engine();
    Wheel wheel = new Wheel();
    AcceleratorPedal acceleratorPedal = new AcceleratorPedal();
    BreakPedal breakPedal = new BreakPedal();
    String keyCode;
    public Car(Brand brand, Color color, String keyCode) {
        this.brand = brand;
        this.color = color;
        this.keyCode = keyCode;
    }

    public void pushAcceleratorPedal(){
        acceleratorPedal.pushPedal();
        if (acceleratorPedal.pedalDown){
            this.engine.increaseCurrentSpeed();
        }
    }
    public void pushBreakPedal(){
        breakPedal.pushPedal();
        if (breakPedal.pedalDown){
            this.engine.decreaseCurrentSpeed();
        }
    }

    public static void main(String[] args) {
        Car car = new Car(Brand.KIA, Color.BLACK, "");
        System.out.println(car.engine.speed);
        car.pushAcceleratorPedal();
        System.out.println(car.engine.speed);
        car.pushBreakPedal();
        System.out.println(car.engine.speed);
    }
}
