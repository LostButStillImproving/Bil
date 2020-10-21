package com.undervisning.car;

import org.junit.Assert;
import org.junit.Test;

public class PEDALSTest extends CarTest {

    @Test
    public void testAccelerate(){
        car.acceleratorPedal.pushPedal();
        Assert.assertTrue(car.acceleratorPedal.pedalDown);
        car.breakPedal.pushPedal();
        Assert.assertTrue(car.breakPedal.pedalDown);
    }

    @Test
    public void testLiftAccelator(){
        car.acceleratorPedal.pushPedal();
        Assert.assertTrue(car.acceleratorPedal.pedalDown);
    }

    @Test
    public void testBreakPedal(){
        car.breakPedal.pushPedal();
        Assert.assertTrue(car.breakPedal.pedalDown);
    }

    @Test
    public void testLiftBreakPedal(){
        car.breakPedal.liftPedal();
        Assert.assertFalse(car.breakPedal.pedalDown);
    }
}
