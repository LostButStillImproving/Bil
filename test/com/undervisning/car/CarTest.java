package com.undervisning.car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CarTest {

    public Car car;

    @Before
    public void setUp() {
        car = new Car(Car.Brand.KIA, "hunter123");
    }

    @Test
    public void testBrand() {
        Assert.assertEquals(Car.Brand.KIA,car.brand);
    }
}
