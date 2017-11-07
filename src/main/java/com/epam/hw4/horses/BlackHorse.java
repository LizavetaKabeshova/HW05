package com.epam.hw4.horses;

public class BlackHorse extends AbstractHorse {

    public BlackHorse() {
    }

    @Override
    public int getSpeed() {
        int speed = 3 + (int) (Math.random() * 8);
        return speed;
    }

    @Override
    public String getInfo() {
        return "[3]Yo, my name is B, i'm superstar";
    }
}
