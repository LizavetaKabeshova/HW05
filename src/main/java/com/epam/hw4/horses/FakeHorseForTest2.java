package com.epam.hw4.horses;

public class FakeHorseForTest2 extends AbstractHorse {

    public FakeHorseForTest2() {
    }

    @Override
    public int getSpeed() {
        int speed = 2;
        return speed;
    }

    @Override
    public String getInfo() {
        return "FH2";
    }
}
