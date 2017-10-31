package com.epam.hw3;

import com.epam.hw3.Behaviors.SpeakBehavior;
import com.epam.hw3.Behaviors.SwimBehavior;

public abstract class AbstractDuck {
    protected AbstractDuck() {
    }
    protected SpeakBehavior speakBehavior;
    protected SwimBehavior swimBehavior;
    public String getVoice() {
        return speakBehavior.speak();
    }
    public String getSwim() {
        return swimBehavior.swim();
    }
    public abstract String getInfo();
}