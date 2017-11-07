package com.epam.hw4.Behaviors;

public class RunNormal implements RunBehavior {
    @Override
    public int run() {
        int speed = 3 + (int) (Math.random() * 8);
        return speed;
    }
}
