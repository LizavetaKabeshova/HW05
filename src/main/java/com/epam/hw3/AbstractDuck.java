package com.epam.hw3;

public abstract class AbstractDuck {
    protected AbstractDuck() {
    }
    protected SpeakBehavior speakBehavior;
    protected SwimBehavior swimBehavior;
    public void getVoice() {
        speakBehavior.speak();
    }
    public void getSwim() {
        swimBehavior.swim();
    }
    public abstract void getInfo();
}