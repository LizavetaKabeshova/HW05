package com.epam.hw4.horses;


import com.epam.hw4.Behaviors.RunFast;

public class WhiteHorse extends AbstractHorse {
    public WhiteHorse() {
        runBehavior = new RunFast();
    }

    @Override
    public String getInfo() {
        return "[1]I'm white, Hi, I'm the fastest";
    }
}
