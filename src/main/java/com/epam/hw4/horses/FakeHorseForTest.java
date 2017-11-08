package com.epam.hw4.horses;

public class FakeHorseForTest extends AbstractHorse {

    public FakeHorseForTest() {
    }

    @Override
    public int getSpeed() {
        int speed = 1;
        return speed;
    }

    @Override
    public String getInfo() {
        return "FH";
    }
}
