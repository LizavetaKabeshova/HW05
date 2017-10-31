package com.epam.hw3.Ducks;

import com.epam.hw3.AbstractDuck;
import com.epam.hw3.Behaviors.SpeakCreya;
import com.epam.hw3.Behaviors.SwimBad;

public class YellowDuck extends AbstractDuck {
    public  YellowDuck() {
        speakBehavior = new SpeakCreya();
        swimBehavior = new SwimBad();
    }

    @Override
    public String getInfo() {
        return "I am yellow!";
    }
}
