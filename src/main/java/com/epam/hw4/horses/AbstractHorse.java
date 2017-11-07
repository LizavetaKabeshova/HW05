package com.epam.hw4.horses;

import com.epam.hw4.Behaviors.RunBehavior;

public abstract class AbstractHorse {
    protected AbstractHorse () {
    }

    protected RunBehavior runBehavior;

    public int getRun() {
        return runBehavior.run();
    }

    public abstract String getInfo();
}

