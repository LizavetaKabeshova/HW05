package com.epam.hw4.Behaviors;

public class RunSlow implements RunBehavior {
    @Override
    public int run() {
        int speed = 0 + (int) (Math.random() * 5);
        return speed;
    }
}
