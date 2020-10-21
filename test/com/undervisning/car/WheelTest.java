package com.undervisning.car;

import org.junit.Assert;
import org.junit.Test;

public class WheelTest extends CarTest {

    @Test
    public void testTurnWheelLeft() {
        car.wheel.turnWheelLeft();
        Assert.assertEquals(45, car.wheel.getWheelDirection());
    }
    @Test
    public void testTurnWheelRightAlot() {
        car.wheel.turnWheelRight();
        Assert.assertEquals(-45,  car.wheel.getWheelDirection());
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        car.wheel.turnWheelRight();
        Assert.assertEquals(-360, car.wheel.getWheelDirection());
        car.wheel.turnWheelLeft();

    }

    @Test
    public void testTurnWheelRightAndLeft() {
        car.wheel.turnWheelLeft();
        car.wheel.turnWheelRight();
        Assert.assertEquals(0 , car.wheel.getWheelDirection());
    }
}
