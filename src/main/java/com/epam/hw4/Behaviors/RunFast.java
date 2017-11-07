package com.epam.hw4.Behaviors;

public class RunFast implements RunBehavior {
    @Override
    public int run() {
        int speed = 5 + (int) (Math.random() * 10);
        return speed;
    }
}
