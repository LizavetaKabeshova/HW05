package com.epam.hw4.horses;

import com.epam.hw4.Behaviors.RunSlow;

public class BlackHorse extends AbstractHorse {
    public BlackHorse() {
        runBehavior = new RunSlow();
    }

    @Override
    public String getInfo() {
        return "[3]Yo, my name is B, i'm superstar";
    }
}
