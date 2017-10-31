package com.epam.hw3;

import com.epam.hw3.Ducks.DrakeDuck;
import com.epam.hw3.Ducks.YellowDuck;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
/*
    //First
    @Test
    public void testYellowDuck() {
        Assert.assertEquals("I am yellow!", Main.getInfoDuck(new YellowDuck()));
        Assert.assertEquals("Creya!", Main.getVoiceDuck(new YellowDuck()));
        Assert.assertEquals("I can't swim", Main.getSwimDuck(new YellowDuck()));
    }

    @Test
    public void testDrakeDuck() {
        Assert.assertEquals("I am drake!", Main.getInfoDuck(new DrakeDuck()));
        Assert.assertEquals("Quack!", Main.getVoiceDuck(new DrakeDuck()));
        Assert.assertEquals("I can swiiiiiiiiiiiiiiiiiiiiiim", Main.getSwimDuck(new DrakeDuck()));
    }
*/

/*-----------------------------*/

    //Second
    @Test
    public void testSetDuck() {
        Assert.assertEquals("I am drake! I can swiiiiiiiiiiiiiiiiiiiiiim! Quack!", Main.setDuck(-10));
        Assert.assertEquals("I am yellow! I can't swim( Creya!", Main.setDuck(10));
    }
}

