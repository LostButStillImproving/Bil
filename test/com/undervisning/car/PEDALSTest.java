package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PEDALSTest extends CarTest {

    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        car = new Car(Car.Brand.KIA, "hunter123");
    }

    @Test
    public void testAccelerate(){
        PEDALS.ACCELERATOR_PEDAL.pushPedal();
        Assert.assertTrue(PEDALS.ACCELERATOR_PEDAL.pedalDown);
        PEDALS.BREAK_PEDAL.pushPedal();
        Assert.assertFalse(!PEDALS.BREAK_PEDAL.pedalDown);
    }

    @Test
    public void testLiftAccelator(){
        PEDALS.ACCELERATOR_PEDAL.pushPedal();
        Assert.assertTrue(PEDALS.ACCELERATOR_PEDAL.pedalDown);
    }

    @Test
    public void testBreakPedal(){
        PEDALS.BREAK_PEDAL.pushPedal();
        Assert.assertTrue(PEDALS.BREAK_PEDAL.pedalDown);
    }

    @Test
    public void testLiftBreakPedal(){
        PEDALS.BREAK_PEDAL.liftPedal();
        Assert.assertFalse(PEDALS.BREAK_PEDAL.pedalDown);
    }
}