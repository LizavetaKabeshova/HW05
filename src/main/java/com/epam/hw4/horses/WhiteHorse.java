package com.epam.hw4.horses;

public class WhiteHorse extends AbstractHorse {
    public WhiteHorse() {
    }

    @Override
    public int getSpeed() {
        int speed = 1 + (int) (Math.random() * 5);
        return speed;
    }

    @Override
    public String getInfo() {
        return "[1]I'm white, Hi, I'm the fastest";
    }
}
