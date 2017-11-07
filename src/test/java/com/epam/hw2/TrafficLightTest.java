package com.epam.hw2;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTest {

    @Test
    public void testKnowLight() {
        Assert.assertEquals(1, TrafficLight.getLight(1));
        Assert.assertEquals(1, TrafficLight.getLight(2));
        Assert.assertEquals(2, TrafficLight.getLight(3));
        Assert.assertEquals(2, TrafficLight.getLight(4));
        Assert.assertEquals(2, TrafficLight.getLight(5));
        Assert.assertEquals(3, TrafficLight.getLight(6));
        Assert.assertEquals(3, TrafficLight.getLight(7));
        Assert.assertEquals(3, TrafficLight.getLight(8));
        Assert.assertEquals(3, TrafficLight.getLight(9));
        Assert.assertEquals(3, TrafficLight.getLight(0));
    }
}
