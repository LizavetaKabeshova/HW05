package com.epam.hw4.horses;

public class FakeHorseForTest3 extends AbstractHorse {

    public FakeHorseForTest3() {
    }

    @Override
    public int getSpeed() {
        int speed = 3;
        return speed;
    }

    @Override
    public String getInfo() {
        return "FH3";
    }
}
