package com.epam.hw4.horses;

public class PurpleHorse extends AbstractHorse{
    public PurpleHorse() {
    }

    @Override
    public int getSpeed() {
        int speed = 5 + (int) (Math.random() * 10);
        return speed;
    }

    @Override
    public String getInfo() {
        return "[2]Hello, I'm dangerous";
    }
}
