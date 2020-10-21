package com.undervisning.car;

import org.junit.Assert;
import org.junit.Test;

public class EngineTest extends CarTest {

    @Test
    public void testStartEngine() {
        car.engine.start("hunter123");
        Assert.assertTrue("The car was supposed to turn on",car.engine.isOn);
    }

    @Test
    public void testTurnEngineOff() {
        car.engine.start("hunter123");
        Assert.assertTrue("The car was supposed to turn on", car.engine.isOn);
        car.engine.TurnEngineOff();
        Assert.assertFalse(car.isOn);

        // Assert.assertFalse("The engine wasn't supposed to turn on", !car.engineOn);
    }

    @Test
    public void testStartEngineWrongKEy() {
        car.engine.start("hunter321");
        Assert.assertFalse("The car wasn't supposed to turn on",car.engine.isOn);
    }

    @Test
    public void testTurnOffEngine() {
        car.engine.start("hunter123");
        car.engine.TurnEngineOff();
        Assert.assertFalse("the engine was supposed to turn off",
                car.isOn);
        Car car2 = new Car(Car.Brand.KIA, "hunter123");
        car2.engine.start("hunter123");
        car2.engine.TurnEngineOff();
        System.out.println(car2.isOn);
        Assert.assertFalse(car2.engine.isOn);
    }

    @Test
    public void testIsEngineON() {
        car.engine.start("huntere");
        Assert.assertFalse("The car wasnt supposed to be turned on",
                car.engine.isEngineOn());

        car.engine.start("hunter123");
        Assert.assertTrue("The car is supposed to be on", car.engine.isOn);
        car.wheel.turnWheelLeft();
    }

}
