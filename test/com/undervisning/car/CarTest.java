package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CarTest {

    public Car car;

    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        car = new Car(Car.Brand.KIA, "hunter123");
    }

    @Test
    public void testStartEngine() {
        car.startEngine("hunter123");
        Assert.assertTrue("The car was supposed to turn on",car.engineOn);
    }

    @Test
    public void testTurnEngineOff() {
        car.startEngine("hunter123");
        Assert.assertTrue("The car was supposed to turn on", car.engineOn);
        car.TurnEngineOff();
        Assert.assertFalse(car.engineOn);

       // Assert.assertFalse("The engine wasn't supposed to turn on", !car.engineOn);
    }

    @Test
    public void testStartEngineWrongKEy() {
        car.startEngine("hunter321");
        Assert.assertFalse("The car wasn't supposed to turn on",car.engineOn);
    }

    @Test
    public void testTurnOffEngine() {
        car.startEngine("hunter123");
        car.TurnEngineOff();
        Assert.assertFalse("the engine was supposed to turn off",
                car.engineOn);
        Car car2 = new Car(Car.Brand.KIA, "hunter123");
        car2.startEngine("hunter123");
        car2.TurnEngineOff();
        System.out.println(car2.engineOn);
        Assert.assertFalse(car2.engineOn);
    }

    @Test
    public void testIsEngineON() {
        car.startEngine("huntere");
        Assert.assertFalse("The car wasnt supposed to be turned on",
                car.isEngineOn());

        car.startEngine("hunter123");
        Assert.assertTrue("The car is supposed to be on", car.engineOn);
    }

    @Test
    public void testBrand() {
        Assert.assertEquals(Car.Brand.KIA,car.brand);
    }
}
