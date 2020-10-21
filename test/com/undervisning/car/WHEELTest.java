package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WHEELTest extends CarTest {

    @Before
    public void setUp() {
        car = new Car(Car.Brand.KIA, "hunter123");
        WHEEL.WHEEL.currentWheelDirection = 0;
    }


    @Test
    public void testTurnWheelLeft() {
        WHEEL.WHEEL.turnWheelLeft();
        Assert.assertEquals(45, WHEEL.WHEEL.getWheelDirection());
    }
    @Test
    public void testTurnWheelRightAlot() {
        WHEEL.WHEEL.turnWheelRight();
        Assert.assertEquals(-45, WHEEL.WHEEL.getWheelDirection());
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        WHEEL.WHEEL.turnWheelRight();
        Assert.assertEquals(-360, WHEEL.WHEEL.getWheelDirection());
        WHEEL.WHEEL.turnWheelLeft();

    }

    @Test
    public void testTurnWheelRightAndLeft() {
        WHEEL.WHEEL.turnWheelLeft();
        WHEEL.WHEEL.turnWheelRight();
        Assert.assertEquals(0 , WHEEL.WHEEL.getWheelDirection());
    }
}
