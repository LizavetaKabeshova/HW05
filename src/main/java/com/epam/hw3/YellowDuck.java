package com.epam.hw3;

public class YellowDuck extends AbstractDuck{
    public YellowDuck() {
        speakBehavior = new SpeakCreya();
        swimBehavior = new SwimBad();
    }

    @Override
    public void getInfo() {
        System.out.println("I am yellow!");
    }
}
