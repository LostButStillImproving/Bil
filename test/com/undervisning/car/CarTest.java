package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CarTest {
    Car car;
    Engine engine;

    @Before
    public void setUp() {
        car = new Car(Brand.KIA, Color.BLACK, "hunter123");
        car.color.printColor();
        car.brand.printBrand();
    }

    @Test
    public void testBrand() {
        Assert.assertEquals(Brand.KIA,car.brand);
    }
}
