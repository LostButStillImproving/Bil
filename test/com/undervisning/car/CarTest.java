package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("hunter123");
    }

    @Test
    public void testStartEngine() throws Exception {
        setUp();
        car.startEngine("hunter123");
        Assert.assertTrue("The car was supposed to turn on",car.engineOn);
    }

    @Test
    public void testStartEngineWrongKEy() throws Exception {
        setUp();
        car.startEngine("hunter321");
        Assert.assertFalse("The car wasn't supposed to turn on",car.engineOn);
    }

    @Test
    public void testTurnOffEngine() throws Exception {
        setUp();
        car.startEngine("hunter123");
        car.TurnOffEngine();
        Assert.assertFalse("the engine was supposed to turn off",
                car.engineOn);
    }

    @Test
    public void testIsEngineON() throws Exception {
        setUp();
        car.startEngine("huntere");
        Assert.assertFalse("The car wasnt supposed to be turned on",
                car.isEngineOn());

        car.startEngine("hunter123");
        Assert.assertTrue("The car is supposed to be on", car.engineOn);
    }

    @Test
    public void testTurnWheelLeft() throws Exception {
        setUp();
        car.turnWheelLeft();
        Assert.assertEquals(45, car.getWheelDirection());
    }
    @Test
    public void testTurnWheelRight() throws Exception {
        setUp();
        car.turnWheelRight();
        Assert.assertEquals(-45, car.getWheelDirection());
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        car.turnWheelRight();
        Assert.assertEquals(-360, car.getWheelDirection());
    }
}
