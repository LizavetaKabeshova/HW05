package com.epam.hw2;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTest {

    @Test
    public void testKnowLight() {
        Assert.assertEquals((long)1, (long)TrafficLight.getLight(1));
        Assert.assertEquals((long)1, (long)TrafficLight.getLight(2));
        Assert.assertEquals((long)2, (long)TrafficLight.getLight(3));
        Assert.assertEquals((long)2, (long)TrafficLight.getLight(4));
        Assert.assertEquals((long)2, (long)TrafficLight.getLight(5));
        Assert.assertEquals((long)3, (long)TrafficLight.getLight(6));
        Assert.assertEquals((long)3, (long)TrafficLight.getLight(7));
        Assert.assertEquals((long)3, (long)TrafficLight.getLight(8));
        Assert.assertEquals((long)3, (long)TrafficLight.getLight(9));
        Assert.assertEquals((long)3, (long)TrafficLight.getLight(0));
    }
}
