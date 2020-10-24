package com.undervisning.car;

import org.junit.Assert;
import org.junit.Test;

public class EngineTest extends CarTest {

    @Test
    public void testStartEngine() {
        car.engine.turnEngineOn();
        Assert.assertTrue("The car was supposed to turn on",car.engine.isEngineOn());
    }

    @Test
    public void testTurnEngineOff() {
        car.engine.turnEngineOn();
        Assert.assertTrue("The car was supposed to turn on", car.engine.isEngineOn());
        car.engine.turnEngineOff();
        Assert.assertFalse(car.engine.isEngineOn());
    }

    @Test
    public void testStartEngineWrongKEy() {
        car.engine.turnEngineOn();
        Assert.assertFalse("The car wasn't supposed to turn on",car.engine.isEngineOn());
    }

    @Test
    public void testTurnOffEngine() {
        car.engine.turnEngineOn();
        car.engine.turnEngineOff();
        Assert.assertFalse("the engine was supposed to turn off",
                car.engine.isEngineOn());
        Car car2 = new Car(Brand.KIA, Color.ORANGE);
        car2.engine.turnEngineOn();
        car2.engine.turnEngineOff();
        System.out.println(car.engine.isEngineOn());
        Assert.assertFalse(car2.engine.isEngineOn());
    }

    @Test
    public void testIsEngineON() {
        car.engine.turnEngineOn();
        Assert.assertFalse("The car wasnt supposed to be turned on",
                car.engine.isEngineOn());

        car.engine.turnEngineOn();
        Assert.assertTrue("The car is supposed to be on", car.engine.isEngineOn());
        car.wheel.turnWheelLeft();
    }
}
