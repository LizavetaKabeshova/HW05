package com.epam.hw4.horses;

import com.epam.hw4.Behaviors.RunNormal;

public class PurpleHorse extends AbstractHorse{
    public PurpleHorse() {
        runBehavior = new RunNormal();
    }

    @Override
    public String getInfo() {
        return "[2]Hello, I'm dangerous";
    }
}
