package com.epam.hw3;

import com.epam.hw3.Ducks.DrakeDuck;
import com.epam.hw3.Ducks.YellowDuck;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSetDuck() {
        Assert.assertEquals("I am drake! I can swiiiiiiiiiiiiiiiiiiiiiim! Quack!", Main.setDuck(-10));
        Assert.assertEquals("I am yellow! I can't swim( Creya!", Main.setDuck(10));
    }
}

